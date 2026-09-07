package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        Integer temp = 0;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        for(var i : c1){
            temp = map1.get(i);
            if(temp == null) {
                temp = 0;
                map1.put(i, temp);
            }
            else
                map1.put(i, temp+1);
        }
        for(var i : c2){
            temp = map2.get(i);
            if(temp == null) {
                temp = 0;
                map2.put(i, temp);
            }
            else
                map2.put(i, temp+1);
        }

        return map1.equals(map2);
    }
    public static boolean isAnagram2(String s, String t){
        int[] arr = new int[30];

        if(s.length() != t.length())
            return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        for (var i : c1){
            arr[i - 'a']++;
        }
        for (var i : c2){
            arr[i - 'a']--;
        }

        for(var i : arr)
            if(i != 0)
                return false;
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isAnagram2("Helloworld".toLowerCase(), "Helloworld".toLowerCase()));
    }
}

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */