package com.blog.blogPosts;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BlogsController {

    private final BlogsService blogsService;

    @Autowired
    BlogsController(BlogsService blogsService){
        this.blogsService = blogsService;
    }

    @GetMapping("/blogs")
    public ResponseEntity<?> blogs(@RequestParam(required = false) Integer limit){
        try {
            return ResponseEntity.ok(blogsService.getBlogs(limit));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to fetch blogs: " + e.getMessage());
        }
    }
}
