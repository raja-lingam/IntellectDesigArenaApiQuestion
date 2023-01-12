package com.example.notificationSender.controller.exception;

import com.example.notificationSender.exception.APIWrongParamException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(value=APIWrongParamException.class)
    public ResponseEntity<String> handleWrongParamException(APIWrongParamException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
