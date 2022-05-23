package com.junit.practice2;

public class TestScores {
    static int score;
    public static void main(String[] args){
       System.out.println(checkScore(score));
    }

    public static String checkScore(int score){
        if (score >= 90 && score <= 100 ){
            return "Your grade is an A!";
        } else if (score >= 80 && score < 90){
            return "Your grade is a B!";
        } else if (score >= 70 && score < 80){
            return "Your grade is a C!";
        } else if (score >= 60 && score < 70){
            return "Your grade is a D!";
        } else if (score >= 0 && score < 59) {
            return "Your grade is an F! :(";
        } else {
            return "You entered a number outside of the specified range!";
        }
    }

}