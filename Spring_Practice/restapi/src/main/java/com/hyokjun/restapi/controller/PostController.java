package com.hyokjun.restapi.controller;

import com.hyokjun.restapi.entiry.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
public class PostController {

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Void> createPost(@RequestBody Map<String, Object> requestBody)
    {
        System.out.println("creatPost");

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "")
    public List<Post> getPostList(@RequestParam(value = "postId", required = false) String postId) {
        ArrayList<Post> posts = new ArrayList<>();

        for(int i=1; i <= 10; i++) {
            Post post = new Post();
            post.setPostId(Integer.toString(i));
            post.setTitle("title" + i);
            post.setContents("content" + i);
            posts.add(post);
        }
        return posts;
    }

    @PutMapping(value = "/{postId}")
    public ResponseEntity<Void> updatePost(@PathVariable String postId) {
        System.out.println("UpdatePost");
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @GetMapping(value = "/{postId}")
//    public ResponseEntity<Void>

    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePost(@PathVariable String postId) {
        System.out.println("DeletePost");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
