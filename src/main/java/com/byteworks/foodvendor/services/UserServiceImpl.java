package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.error_handling.UserAlreadyRegisteredException;
import com.byteworks.foodvendor.error_handling.UserNotFoundException;
import com.byteworks.foodvendor.models.Role;
import com.byteworks.foodvendor.models.User;
import com.byteworks.foodvendor.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public User findUserById(String id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(()-> new  UserNotFoundException("User with id " + id + " not found"));
    }

    @Override
    public User registerUser(User user) throws UserAlreadyRegisteredException{
        Optional<User>  maybeUser = userRepository.findByEmail(user.getEmail());
        if(maybeUser.isPresent()){
            throw new UserAlreadyRegisteredException(user.getUsername());
        }

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        Set<Role> roles = new HashSet<>();
        roles.add(new Role("DEV"));
        user.setRoles(roles);
      return userRepository.save(user);

    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(()-> new  UserNotFoundException("User with username " + username + " not found"));
    }

}
