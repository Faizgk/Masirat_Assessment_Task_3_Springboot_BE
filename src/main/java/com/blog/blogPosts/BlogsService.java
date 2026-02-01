package com.blog.blogPosts;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogsService {

    public List<BlogModel> getBlogs(Integer limit){

        return BlogsRepo.DB.stream()
                .sorted((b1, b2) -> b2.getId().compareTo(b1.getId()))
                .limit(limit)
                .toList();
    }
}
