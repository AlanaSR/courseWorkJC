package com.courseworkjchw.courseworkjchw.service.impl;

import com.courseworkjchw.courseworkjchw.model.Question;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Mock
    private JavaQuestionServiceImpl questionService;
    private final Question testQ = new Question("1", "1");
    private final Question testQ2 = new Question("2", "2");
    private final Question testQ3 = new Question("3", "3");


    @Test
    void getQuestions() {
        Mockito.when(questionService.getAll())
                .thenReturn(Arrays.asList(testQ, testQ2, testQ3));
        Mockito.when(questionService.getRandomQuestion()).thenReturn(testQ, testQ2, testQ3);
        Collection<Question> questions = examinerService.getQuestions(3);
        assertTrue(questions.containsAll(Arrays.asList(testQ, testQ2, testQ3)));
    }
}