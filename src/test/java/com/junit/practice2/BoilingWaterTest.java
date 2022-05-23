package com.junit.practice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class BoilingWaterTest {
    /**
     * Rigorous Test.
     */
    @Test
    @DisplayName ("BoilingWater() method test")
    void testBoilingWater() {
        assertEquals("Water is boiling!", BoilingWater.boilingWater(215));
        assertEquals("Water is not boiling!", BoilingWater.boilingWater(200));
    }
}
