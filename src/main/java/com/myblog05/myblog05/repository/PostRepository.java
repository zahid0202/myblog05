package com.myblog05.myblog05.repository;

import com.myblog05.myblog05.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
