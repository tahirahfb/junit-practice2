package com.junit.practice2;

public class AverageMethod {
    static double numUno, numDos, numTres;
    public static void main(String[] args){
        System.out.println("The average is: " + average(numUno, numDos, numTres));
    }

    public static double sum(double numOne, double numTwo, double numThree){

        return numOne + numTwo + numThree;
    }

    public static double average(double numUno, double numDos, double numTres){

        return sum(numUno, numDos, numTres) / 3.0;

    }
}
