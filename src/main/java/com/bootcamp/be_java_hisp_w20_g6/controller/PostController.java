package com.bootcamp.be_java_hisp_w20_g6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.be_java_hisp_w20_g6.dto.request.PostRequestDto;
import com.bootcamp.be_java_hisp_w20_g6.service.Interface.IPostService;

@RestController
@RequestMapping("products")
public class PostController {
    
    @Autowired
    private IPostService postService;

    @PostMapping("/post")
    public ResponseEntity<Boolean> save(@RequestBody PostRequestDto requestDto) {
        return new ResponseEntity<Boolean>(postService.save(requestDto), HttpStatus.OK);
    }
}
