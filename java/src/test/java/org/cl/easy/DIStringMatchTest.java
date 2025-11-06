package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIStringMatchTest {

    @Test
    void diStringMatch_example1() {
        String s = "IDID";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, di.diStringMatch(s));
    }

    @Test
    void diStringMatch_example2() {
        String s = "III";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{0,1,2,3}, di.diStringMatch(s));
    }

    @Test
    void diStringMatch_example3() {
        String s = "DDI";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{3,2,0,1}, di.diStringMatch(s));
    }

    @Test
    void diStringMatch_example4() {
        String s = "DDDDD";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{5,4,3,2,1,0}, di.diStringMatch(s));
    }

    @Test
    void diStringMatch_example5() {
        String s = "IIDII";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{0,1,5,2,3,4}, di.diStringMatch(s));
    }

    @Test
    void diStringMatch_example6() {
        String s = "DIDII";
        DIStringMatch di = new DIStringMatch();
        assertArrayEquals(new int[]{5,0,4,1,2,3}, di.diStringMatch(s));
    }
}