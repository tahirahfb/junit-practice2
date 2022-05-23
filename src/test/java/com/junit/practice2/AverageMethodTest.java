package com.junit.practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageMethodTest {
    
    @Test
    @DisplayName ("AverageMethod() method")
    void testAverageMethod() {
        assertEquals("The average is: 4", AverageMethod.average(2, 4, 6));
        
        
    }
}