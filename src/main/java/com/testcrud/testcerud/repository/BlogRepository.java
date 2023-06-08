package com.testcrud.testcerud.repository;

import com.testcrud.testcerud.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlogRepository extends JpaRepository<Blog, String> {
    List<Blog> findAllByBlogJudul(Iterable<String> blogJudul);
}
