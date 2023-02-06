package com.example.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApplication.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{

}
