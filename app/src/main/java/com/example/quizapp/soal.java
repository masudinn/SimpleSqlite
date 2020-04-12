package com.example.quizapp;

public class soal {
    private String question;
    private String options1;
    private String options2;
    private String options3;
    private int answer;

    public soal(String question, String options1, String options2, String options3, int answer) {
        this.question = question;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions1() {
        return options1;
    }

    public void setOptions1(String options1) {
        this.options1 = options1;
    }

    public String getOptions2() {
        return options2;
    }

    public void setOptions2(String options2) {
        this.options2 = options2;
    }

    public String getOptions3() {
        return options3;
    }

    public void setOptions3(String options3) {
        this.options3 = options3;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
