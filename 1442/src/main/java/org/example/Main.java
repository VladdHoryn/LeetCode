package org.example;

public class Main {
    public static int countXOR_a(int[] arr, int i, int j){
        int res = arr[i];

        for(int step = i + 1; step < j; ++step){
            res = res ^ arr[step];
        }

        return res;
    }

    public static int countXOR_b(int[] arr, int j, int k){
        int res = arr[j];

        for(int step = j + 1; step <= k; ++step){
            res = res ^ arr[step];
        }

        return res;
    }

    public static int countTriplets(int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        int res = 0;
        int a = 0;
        int b = 0;
        for (int step1 = 0; step1 < arr.length; ++step1){
            i = step1;
            for(int step2 = step1 + 1; step2 < arr.length; ++step2){
                j = step2;
                for(int step3 = step2; step3 < arr.length; ++step3){
                    k = step3;

                    a = countXOR_a(arr, i, j);
                    b = countXOR_b(arr, j, k);

                    if (a == b)
                        res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(countTriplets(new int[] {2,3,1,6,7}));

        System.out.println(countTriplets(new int[] {1,1,1,1,1}));
    }
}

/*
1442. Count Triplets That Can Form Two Arrays of Equal XOR
Medium
        Topics
premium lock icon
        Companies
Hint
Given an array of integers arr.

We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).

Let's define a and b as follows:

a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
Note that ^ denotes the bitwise-xor operation.

Return the number of triplets (i, j and k) Where a == b.

Example 1:

Input: arr = [2,3,1,6,7]
Output: 4
Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
Example 2:

Input: arr = [1,1,1,1,1]
Output: 10*/
