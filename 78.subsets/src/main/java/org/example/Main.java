package org.example;

import java.util.*;

public class Main {
    static Set<List<Integer>> result = new HashSet<>();

    public static void backtrack(int[] nums, List<Integer> curr, int index){
        if(index == nums.length) {
            result.add(curr);
            return;
        }

        curr.add(nums[index]);
        backtrack(nums, new ArrayList<>(curr), index+1);
        curr.removeLast();
        backtrack(nums, new ArrayList<>(curr), index+1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, new ArrayList<>(), 0);

        return result.stream().toList();
    }

    public static void main(String[] args) {

        System.out.println(subsets(new int[]{1,2,3}));
    }
}
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]


Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */