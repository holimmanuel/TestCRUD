package com.testcrud.testcerud.controller;

import com.testcrud.testcerud.model.Blog;
import com.testcrud.testcerud.response.ResponseHandler;
import com.testcrud.testcerud.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    // Melihat Blog Secara Spesifik
    @GetMapping("{blogId}")
    public ResponseEntity <Object> getBlogDetails(@PathVariable("blogId") String blogId) {
        return ResponseHandler.responseBuilder("Blog Ditemukan", HttpStatus.OK,blogService.getBlog(blogId));
    }

    // Melihat Blog Secara Keseluruhan
    @GetMapping
    public List<Blog> getAllBlogDetails(){
        return blogService.getAllBlog();
    }

    @PostMapping
    private String createBlogDetails(@RequestBody Blog blog){
        blogService.createBlog(blog);
        return "Blog Sudah Ditambahkan";
    }

    @PutMapping
    private String updateBlogDetails(@RequestBody Blog blog) {
        blogService.updateBlog(blog);
        return "Blog Sudah Dirubah";
    }

    @DeleteMapping("{blogId}")
    private String deleteBlogDetails(@PathVariable("blogId") String blogId) {
        blogService.deleteBlog(blogId);
        return "Blog Sudah Dihapus";
    }
}
