package com.courseworkjchw.courseworkjchw.service.impl;

import com.courseworkjchw.courseworkjchw.exceptions.QuestionNotFoundException;
import com.courseworkjchw.courseworkjchw.model.Question;
import com.courseworkjchw.courseworkjchw.servise.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Set<Question> questions = new HashSet<>();
    private final Random random = new Random();

    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    public Collection<Question> getAll() {
        return questions;
    }

    public Question getRandomQuestion() {
        return questions.stream().skip(random.nextInt(questions.size())).findFirst()
                .orElseThrow(()->new QuestionNotFoundException());
    }
}
