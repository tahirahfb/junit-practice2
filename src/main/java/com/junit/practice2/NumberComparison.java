package com.junit.practice2;

public class NumberComparison {
    static int num1;
    static int num2;
    public static void main(String[] args){
    
        System.out.println(compare(num1, num2));
    
    }

    public static String compare(int num1, int num2){
        if (num1 == num2){
            return "Numbers are the same!";
        } else if (num1 > num2){
            return "The first number was larger than the second!";
        } else {
            return "The second number was larger than the first!";
        }
    }
}
