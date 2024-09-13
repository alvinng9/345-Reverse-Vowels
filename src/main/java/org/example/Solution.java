package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {
        //create a hashset to include all the vowels
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        //create an ArrayList to find all the indexes of vowels
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(Character.toLowerCase(s.charAt(i)))) {
                list.add(i);
            }
        }
        //convert the String into a char array
        char[] array = s.toCharArray();
        //swap indexes of vowels
        while(!list.isEmpty()) {
            if (list.size() > 1) {
                int x = list.get(0);
                int y = list.get(list.size() - 1);
                swap(array, x, y);
                list.remove(list.size() - 1);
            }
            list.remove(0);
        }
        //create a StringBuilder
        StringBuilder sb = new StringBuilder();
        //add all char from the array to the StringBuilder
        for (char c : array) {
            sb.append(c);
        }
        //return the String
        return sb.toString();
    }

    //swap values of a char array
    public void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
