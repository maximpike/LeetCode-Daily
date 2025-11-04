package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    @Test
    void numberJewelsInStones_example1() {
        JewelsAndStones js = new JewelsAndStones();
        assertEquals(3, js.numberJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void numberJewelsInStones_example2() {
        JewelsAndStones js = new JewelsAndStones();
        assertEquals(0, js.numberJewelsInStones("z", "ZZ"));
    }

    @Test
    void numberJewelsInStones_example3() {
        JewelsAndStones js = new JewelsAndStones();
        assertEquals(5, js.numberJewelsInStones("AbC", "AAbCC"));
    }
}