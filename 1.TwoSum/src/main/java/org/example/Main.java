package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        int step = 0;
        for(var i : nums){
            if(numbers.get(target-i) != null)
                return new int[]{step, numbers.get(target-i)};

            numbers.put(i, step);

            step++;
        }

        return new int[]{0, 1};
    }

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{11,2,15,7}, 9);

        for(var i : res){
            System.out.println(i + " ");
        }
    }
}

/*
1. Two Sum
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */