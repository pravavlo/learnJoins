package com.example.learnjoins.Service;

import com.example.learnjoins.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {
    public Comment saveComment(Long tutId, Comment discussion);
    public List<Comment> grabComment();
    public Comment grabTutorialById(long id);
}
