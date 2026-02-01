package com.blog.blogPosts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String featuredImage;
    String excerpt;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }


    public BlogModel(Long id, String title, String featuredImage, String excerpt) {
        this.id = id;
        this.title = title;
        this.featuredImage = featuredImage;
        this.excerpt = excerpt;
    }

    public BlogModel() {
    }


}
