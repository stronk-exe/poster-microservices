package com.poster.poster.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("post")
public class PostController {

    @GetMapping
	public List<String> getPosts() {
		return List.of("mr", "stronk");
	}

//    public List<Post> getPosts() {
//        return List.of(new Post(1, "stronk"));
//    }

}
