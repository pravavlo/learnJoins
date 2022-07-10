package com.example.learnjoins.Controller;

import com.example.learnjoins.Service.CommentService;
import com.example.learnjoins.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CommentControl {
    @Autowired
    private CommentService commentService;

    @PostMapping("/com/{tutId}")
    public Comment saveComment(@PathVariable("tutId") Long tutId, @RequestBody Comment comment) {
        return commentService.saveComment(tutId, comment);
    }

    @GetMapping("/com")
    public List<Comment> grabComment() {
        return commentService.grabComment();
    }
    @GetMapping("/com/{id}")
    public Comment grabTutorialById(@PathVariable("id") long id) {
        return commentService.grabTutorialById(id);
    }
}
