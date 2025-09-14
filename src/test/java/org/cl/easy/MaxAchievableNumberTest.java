package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAchievableNumberTest {

    @Test
    void testTheMaximumAchievable() {
        MaxAchievableNumber m = new MaxAchievableNumber();
        assertEquals(6, m.theMaximumAchievable(4, 1));
        assertEquals(7, m.theMaximumAchievable(3, 2));
        assertEquals(4, m.theMaximumAchievable(2, 1));
        assertEquals(3, m.theMaximumAchievable(1, 1));
        assertEquals(101, m.theMaximumAchievable(1, 50));
        assertEquals(52, m.theMaximumAchievable(50, 1));
        assertEquals(150, m.theMaximumAchievable(50, 50));
    }
}