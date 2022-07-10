package com.example.learnjoins.Repository;

import com.example.learnjoins.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}