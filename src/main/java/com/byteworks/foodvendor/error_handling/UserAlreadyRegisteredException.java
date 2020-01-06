package com.byteworks.foodvendor.error_handling;

public class UserAlreadyRegisteredException extends RuntimeException {

    public UserAlreadyRegisteredException(String username) {
        super(username + "already registered before now");
    }
}
