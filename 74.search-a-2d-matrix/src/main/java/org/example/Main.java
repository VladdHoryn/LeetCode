package org.example;

public class Main {
    public static int binarySearch(int[] nums, int left, int right, int target){
        if(left > right)
            return -1;

        int k = right - ((right - left) / 2);

        if(nums[k] == target)
            return k;
        if(nums[k] < target){
            return binarySearch(nums, k+1, right, target);
        }
        return binarySearch(nums, left, k-1, target);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.



Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 */