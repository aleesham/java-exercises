package org.launchcode;

import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public abstract class Question {

    protected int points = 1;
    protected String text;
    protected static Scanner userInput = new Scanner(System.in);

    public Question(String text) {
        this.text = text;
    }

    public Question(String text, int points) {
        this(text);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public abstract int runQuestion();

}
