package com.example.learnjoins.Service;

import com.example.learnjoins.Repository.CommentRepository;

import com.example.learnjoins.Repository.TutorialRepository;
import com.example.learnjoins.model.Comment;
import com.example.learnjoins.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private TutorialRepository tutorialRepository;

//    @Override
//    public Comment saveComment(Comment discussion) {
//        return commentRepo.save(discussion);
//    }

    @Override
    public Comment saveComment(Long tutId, Comment discussion) {
        Tutorial tut = tutorialRepository.findById(tutId).get();
        Comment comment = new Comment();
        comment.setContent(discussion.getContent());
        comment.setTutorial(tut);
        return commentRepo.save(comment);

    }

    @Override
    public List<Comment> grabComment() {
        return commentRepo.findAll();
    }

    @Override
    public Comment grabTutorialById(long id) {
        return commentRepo.findById(id).get();
    }
}
