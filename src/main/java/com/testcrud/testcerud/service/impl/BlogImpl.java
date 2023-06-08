package com.testcrud.testcerud.service.impl;

import com.testcrud.testcerud.exception.BlogNotFoundException;
import com.testcrud.testcerud.model.Blog;
import com.testcrud.testcerud.repository.BlogRepository;
import com.testcrud.testcerud.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogImpl implements BlogService {
    BlogRepository blogRepository;

    public BlogImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public String createBlog(Blog blog) {
        blogRepository.save(blog);
        return "Sukses Ditambahkan";
    }

    @Override
    public String updateBlog(Blog blog) {
        blogRepository.save(blog);
        return "Sukses Dirubah";
    }

    @Override
    public String deleteBlog(String blogId) {
        blogRepository.deleteById(blogId);
        return "Sukses Dihapus";
    }

    @Override
    public Blog getBlog(String blogId) {
        if (blogRepository.findById(blogId).isEmpty())
            throw new BlogNotFoundException("Blog Tidak Ditemukan");
        return blogRepository.findById(blogId).get();
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }
}
