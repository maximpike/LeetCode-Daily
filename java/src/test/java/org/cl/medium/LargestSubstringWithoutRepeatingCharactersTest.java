package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring_example1() {
        String s = "abcabcbb";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(3, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example2() {
        String s = "bbbb";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(1, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example3() {
        String s = "pwwkew";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(3, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example4() {
        String s = "abba";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(2, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example5() {
        String s = "tmmzuxt";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(5, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example6() {
        String s = "&";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(1, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example7() {
        String s = "abcccab";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(3, ls.lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring_example8() {
        String s = "abaabdefhhr112";
        LargestSubstringWithoutRepeatingCharacters ls = new LargestSubstringWithoutRepeatingCharacters();
        assertEquals(6, ls.lengthOfLongestSubstring(s));
    }
}