package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Map<Character, Integer> decodeAnagram(String s){
        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {
            if (result.containsKey(s.charAt(i))) {
                result.put(s.charAt(i), result.get(s.charAt(i)));
            } else {
                result.put(s.charAt(i), 1);
            }
        }
        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        List<String> list = new LinkedList<>();

        for(var i : strs){
            char[] arr = i.toCharArray();
            Arrays.sort(arr);

            String sortedI = new String(arr);

            if(result.containsKey(sortedI)){
                list = new ArrayList<>(result.get(sortedI));
                list.add(i);
                result.put(sortedI, list);
            }
            else{
                result.put(sortedI, List.of(i));
            }
        }

        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        List<List<String>> result = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        for(var i : result){
            for(var j : i){
                System.out.print(j + ", ");
            }
            System.out.println();
        }

    }
}