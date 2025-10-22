/*
 * Study Plan: Leetcode 75 - Day 1
 * 
 * Problem: 1768. Merge Strings Alternately
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 * 
 * Author: Himaja Mankala
 * Date: 22/10/2025
 * 
 */

package day01;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(); // use for efficient string concatenation
        int len1 = word1.length();
        int len2 = word2.length();
        int maximum = Math.max(len1, len2); //loop until the longer word's length

        // iterate through both words and append characters alternately
        for (int i = 0; i < maximum; i++) {
            // append from word1 if available
            if (i < len1) {
                result.append(word1.charAt(i));
            }

            // append from word2 if available
            if (i < len2) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString(); // convert StringBuilder to String and return
    }
}
