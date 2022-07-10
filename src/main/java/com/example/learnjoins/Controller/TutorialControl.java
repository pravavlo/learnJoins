package com.example.learnjoins.Controller;

import com.example.learnjoins.Service.TutorialService;
import com.example.learnjoins.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TutorialControl {
      @Autowired
      private TutorialService tutorialService;

    @PostMapping("/tut")
    public Tutorial storeTutorial(@RequestBody Tutorial tutorial)  {
        return tutorialService.storeTutorial(tutorial);
    }

    @GetMapping("/tut")
    public List<Tutorial> fetchTutorial() {
        return tutorialService.fetchTutorial();
    }

    @GetMapping("/tut/{id}")
    public Tutorial fetchTutorialById(@PathVariable("id") long id) {
        return tutorialService.fetchTutorialById(id);
    }
}
