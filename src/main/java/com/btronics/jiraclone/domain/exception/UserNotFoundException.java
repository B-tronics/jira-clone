package com.btronics.jiraclone.domain.exception;

public class UserNotFoundException extends DomainException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
