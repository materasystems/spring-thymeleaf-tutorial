package com.matera.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matera.blog.model.Post;

@Repository //Define a classe como um bean do Spring
public interface PostRepository extends JpaRepository<Post, Long> { } 
//Deve estender JpaRepository e declarar a entidade (Post) e o tipo de chave primária (Long)

