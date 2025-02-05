package com.courseworkjchw.courseworkjchw.controller;

import com.courseworkjchw.courseworkjchw.model.Question;
import com.courseworkjchw.courseworkjchw.servise.api.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.add(question);
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }

    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam("question") String question,
                                   @RequestParam("answer") String answer) {
        return questionService.remove(new Question(question, answer));
    }
}
