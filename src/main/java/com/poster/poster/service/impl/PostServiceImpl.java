package com.poster.poster.service.impl;

import com.poster.poster.entity.PostEntity;
import com.poster.poster.repository.PostRepository;
import com.poster.poster.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public List<PostEntity> findAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Optional<PostEntity> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public PostEntity savePost(PostEntity postEntity) {
        return postRepository.save(postEntity);
    }

}
