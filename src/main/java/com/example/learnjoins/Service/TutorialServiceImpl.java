package com.example.learnjoins.Service;

import com.example.learnjoins.Repository.TutorialRepository;
import com.example.learnjoins.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TutorialServiceImpl implements TutorialService{
    @Autowired
    private TutorialRepository tutorialRepo;
    @Override
    public Tutorial storeTutorial(Tutorial tutorial) {
        return tutorialRepo.save(tutorial);
    }

    @Override
    public List<Tutorial> fetchTutorial() {
        return tutorialRepo.findAll();
    }

    @Override
    public Tutorial fetchTutorialById(long id) {
        return tutorialRepo.findById(id).get();
    }
}
