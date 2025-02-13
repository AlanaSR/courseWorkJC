package com.courseworkjchw.courseworkjchw.service.impl;

import com.courseworkjchw.courseworkjchw.exceptions.QuestionBadRequestException;
import com.courseworkjchw.courseworkjchw.model.Question;
import com.courseworkjchw.courseworkjchw.servise.api.ExaminerService;
import com.courseworkjchw.courseworkjchw.servise.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new QuestionBadRequestException();
        }
        Set<Question> questions = new HashSet<>();
        while (amount > questions.size()) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
