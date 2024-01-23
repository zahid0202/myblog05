package com.myblog05.myblog05.service.impl;

import com.myblog05.myblog05.entity.Post;
import com.myblog05.myblog05.payload.PostDto;
import com.myblog05.myblog05.repository.PostRepository;
import com.myblog05.myblog05.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);
        PostDto dto = new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());

        return dto;
    }
}
