package com.testcrud.testcerud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="blog_info")
public class Blog {

    @Id
    private String blogId;
    private String blogJudul;
    private String blogContent;
    private String blogTgl;
}
