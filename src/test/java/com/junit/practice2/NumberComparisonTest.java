package com.junit.practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparisonTest {
    
    @Test
    @DisplayName ("NumberComparison() method")
    void testNumberComparison() {
        assertEquals("Numbers are the same!", NumberComparison.compare(2,2));
        assertEquals("The first number was larger than the second!", NumberComparison.compare(3,1));
        assertEquals("The second number was larger than the first!", NumberComparison.compare(1,2));
    }
}
