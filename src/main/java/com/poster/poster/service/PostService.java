package com.poster.poster.service;

import com.poster.poster.entity.PostEntity;
import java.util.List;
import java.util.Optional;

public interface PostService {

    List<PostEntity>    findAllPosts();
    Optional<PostEntity> findById(Long id);
    PostEntity savePost(PostEntity postEntity);
}
