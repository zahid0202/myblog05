package com.myblog05.myblog05.controller;

import com.myblog05.myblog05.payload.PostDto;
import com.myblog05.myblog05.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
@PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new  ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
