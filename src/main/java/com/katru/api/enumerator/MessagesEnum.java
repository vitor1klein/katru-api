package com.katru.api.enumerator;

public enum MessagesEnum {
    
    USER_NOT_FOUND("User not found."),
    NEW_MESSAGE("New message here");


    private final String message;

    MessagesEnum (String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
