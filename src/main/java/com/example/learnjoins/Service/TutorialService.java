package com.example.learnjoins.Service;

import com.example.learnjoins.model.Tutorial;

import java.util.List;

public interface TutorialService {
        public Tutorial storeTutorial(Tutorial tutorial);
        public List<Tutorial> fetchTutorial();
        public Tutorial fetchTutorialById(long id);
}
