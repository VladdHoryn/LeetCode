package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length == 1)
            return res.

        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
}