package com.junit.practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameOrNahTest {
    
    @Test
    @DisplayName ("SameOrNah() method")
    void testSameOrNah() {
        assertEquals("The words are the same!", SameOrNah.checkSame("HellO","hello"));
        assertEquals("The words are different!", SameOrNah.checkSame("October", "September"));
        
    }
}
