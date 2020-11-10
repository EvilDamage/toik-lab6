package com.company;

public class QuizImpl implements Quiz {
    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    @Override
    public void isCorrectValue(int value) throws ParamTooLarge, ParamTooSmall {
        if (value > digit) {
            throw new ParamTooLarge();
        }
        if (value < digit) {
            throw new ParamTooSmall();
        }
    }
}
