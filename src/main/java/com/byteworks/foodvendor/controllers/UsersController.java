package com.byteworks.foodvendor.controllers;


import com.byteworks.foodvendor.models.User;
import com.byteworks.foodvendor.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User register(@RequestBody  User user){
        User returnedUser = userService.registerUser(user);
        returnedUser.setPassword(null);
        return returnedUser;
    }


    @PostMapping("/login")
    public ResponseEntity<Object> login() {
        return ResponseEntity
                .ok()
                .body( "User logged In");
    }


}
