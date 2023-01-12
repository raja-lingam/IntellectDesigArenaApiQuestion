package com.example.notificationSender.exception;

public class APIWrongParamException extends RuntimeException {

    public APIWrongParamException(String message){
        super(message);
    }
}
