package com.byteworks.foodvendor.repositories;

import com.byteworks.foodvendor.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository  extends MongoRepository<User,String> {
    Optional<User> findByUsername(String username);
    Optional<User>  findByEmail(String email);
}
