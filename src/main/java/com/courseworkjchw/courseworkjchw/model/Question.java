package com.courseworkjchw.courseworkjchw.model;

public class Question {
    private String question;
    private String answer;

    public Question() {
    }

    public Question(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question: " + question + ", answer: " + answer + '.';
    }
}
