package com.junit.practice2;

public class SameOrNah {
    static String firstWord;
    static String secondWord;
    public static void main(String[] args){
        System.out.println(checkSame(firstWord, secondWord));
    
    }

    public static String checkSame(String firstWord, String secondWord){
    if (firstWord.equalsIgnoreCase(secondWord)){
        return "The words are the same!";
    } else {
        return "The words are different!";
    }

}
}
