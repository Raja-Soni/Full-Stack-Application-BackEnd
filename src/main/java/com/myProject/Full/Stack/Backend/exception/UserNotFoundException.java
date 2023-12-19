package com.myProject.Full.Stack.Backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("User Not Found with the ID "+id);
    }
}
