package com.poster.poster.controller;

import com.poster.poster.entity.PostEntity;
import com.poster.poster.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("post")
public class PostController {

	private final PostService postService;

	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}


    @GetMapping
	public List<PostEntity> findAllPosts() {
		return postService.findAllPosts();
	}

	@GetMapping("/{id}")
	public Optional<PostEntity> findById(Long id) {
		return postService.findById(id);
	}

	@PostMapping
	public PostEntity savePost(@RequestBody PostEntity postEntity) {
		return postService.savePost(postEntity);
	}

}
