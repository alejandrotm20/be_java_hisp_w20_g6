package com.bootcamp.be_java_hisp_w20_g6.config;

import com.bootcamp.be_java_hisp_w20_g6.exception.FollowerExistsException;
import com.bootcamp.be_java_hisp_w20_g6.exception.UserExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(UserExistsException.class)
    public ResponseEntity<String> checkUserExists(UserExistsException userExistsException){
        return new ResponseEntity<>(userExistsException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FollowerExistsException.class)
    public ResponseEntity<String> checkFolowerExists(FollowerExistsException followerExistsException){
        return new ResponseEntity<>(followerExistsException.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
