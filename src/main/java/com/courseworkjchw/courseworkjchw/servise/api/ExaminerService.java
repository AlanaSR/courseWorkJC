package com.courseworkjchw.courseworkjchw.servise.api;


import com.courseworkjchw.courseworkjchw.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions (int amount);
}
