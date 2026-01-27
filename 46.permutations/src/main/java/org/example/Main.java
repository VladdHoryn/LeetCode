package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>  permutation = new ArrayList<>();

        for(int i = 0; i < nums.length; ++i){
            permutation.clear();

            permutation.add(nums[i]);
            for(int j = 0; j < nums.length; ++j){
                if(i != j)
                    permutation.add(nums[j]);
            }


//            System.out.println(permutation);
            res.add(permutation);
        }

        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
}