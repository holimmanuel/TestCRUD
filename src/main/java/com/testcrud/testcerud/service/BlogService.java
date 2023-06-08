package com.testcrud.testcerud.service;

import com.testcrud.testcerud.model.Blog;

import java.util.List;

public interface BlogService {

    public String createBlog(Blog blog);
    public String updateBlog(Blog blog);
    public String deleteBlog(String blogId);
    public Blog getBlog(String blogId);
    public List<Blog> getAllBlog();
}
