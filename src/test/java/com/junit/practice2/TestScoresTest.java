package com.junit.practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScoresTest {
    
    @Test
    @DisplayName ("TestScores() method")
    void testTestScores() {
        assertEquals("Your grade is an A!", TestScores.checkScore(95));
        assertEquals("Your grade is a B!", TestScores.checkScore(85));
        assertEquals("Your grade is a C!", TestScores.checkScore(75));
        assertEquals("Your grade is a D!", TestScores.checkScore(65));
        assertEquals("Your grade is an F :(!", TestScores.checkScore(55));
        assertEquals("You entered a number outside of the specified range!", TestScores.checkScore(-5));
        
    }
}