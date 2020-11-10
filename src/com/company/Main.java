package com.company;

import com.company.Quiz.ParamTooLarge;
import com.company.Quiz.ParamTooSmall;

public class Main {

    public static void main(String[] args) {
        Quiz quiz = new QuizImpl();
        int maximum = Quiz.MAX_VALUE;
        int minimum = Quiz.MIN_VALUE;
        int digit = (maximum + minimum) / 2;

        for (int counter = 1; ; counter++) {

            try {

                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!!! Szukana liczba to: "
                        + digit + " Ilosc prob: " + counter);
                break;

            } catch (ParamTooLarge paramTooLarge) {

                System.out.println("Argument za duzy!!!");

                maximum = digit;
                digit = (maximum + minimum) / 2;

            } catch (ParamTooSmall paramTooSmall) {

                System.out.println("Argument za maly!!!");

                minimum = digit;
                digit = (maximum + minimum) / 2;

            }
        }

    }
}

