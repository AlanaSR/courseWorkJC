package com.courseworkjchw.courseworkjchw.service.impl;

import com.courseworkjchw.courseworkjchw.exceptions.QuestionBadRequestException;
import com.courseworkjchw.courseworkjchw.model.Question;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceImplTest {

    private final JavaQuestionServiceImpl questionService = new JavaQuestionServiceImpl();
    private final Question testQ = new Question("1", "1");

    @Test
    void add() {
        assertTrue(questionService.getAll().isEmpty());
        questionService.add(testQ);
        assertFalse(questionService.getAll().isEmpty());
    }

    @Test
    void testAdd() {
        questionService.add(testQ);
        assertFalse(questionService.getAll().isEmpty());
    }

    @Test
    void remove() {
        questionService.add(testQ);
        assertFalse(questionService.getAll().isEmpty());
        questionService.remove(testQ);
        assertTrue(questionService.getAll().isEmpty());
    }

    @Test
    void getAll() {
        questionService.add(testQ);
        Collection<Question> questions = questionService.getAll();
        assertFalse(questionService.getAll().isEmpty());
        assertTrue(questions.contains(testQ));
    }

    @Test
    void getRandomQuestion() {
        questionService.add(testQ);
        Collection<Question> questions = questionService.getAll();
        assertTrue(questions.contains(testQ));
    }
}