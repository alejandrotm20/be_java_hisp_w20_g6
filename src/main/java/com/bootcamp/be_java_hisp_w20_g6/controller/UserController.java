package com.bootcamp.be_java_hisp_w20_g6.controller;

import com.bootcamp.be_java_hisp_w20_g6.service.Implement.UserServiceImpl;
import com.bootcamp.be_java_hisp_w20_g6.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    IUserService userService;
    @PostMapping("/{userId}/follow/{userIdToFollow}")
    public ResponseEntity<Boolean> followUser(@PathVariable int userId, @PathVariable int userIdToFollow){
        return new ResponseEntity<>(userService.followUser(userId, userIdToFollow), HttpStatus.OK);
    }

}
