package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseVowelsTest() {
        Solution solution = new Solution();
        assertEquals("AceCreIm", solution.reverseVowels("IceCreAm"));
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }

}