package com.junit.practice2;


/**
 * Hello world!
 */
public final class BoilingWater {
    static int twoTwelve;
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println(boilingWater(twoTwelve));
    }
    
     public static String boilingWater(int twoTwelve){
        if (twoTwelve > 212){
            return "Water is boiling!";
    } else {
        return "Water is not boiling";
    }
    }

}



