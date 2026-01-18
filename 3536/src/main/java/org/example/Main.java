package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Integer> divideNumber(int n){
        List<Integer> numb = new LinkedList<>();
        int num = 0;
        int step = 0;

        while (n > 9){
            num = n % 10;

            numb.add(num);

            n /= 10;
            ++step;
        }

        numb.add(n);

        return numb;
    }

    public static int maxProduct(int n) {
        List<Integer> numb = divideNumber(n);

        int rez = 0;

        for(int i = 0; i < numb.size(); ++i){
            for(int j = i + 1; j < numb.size(); ++j){
                if(numb.get(i) * numb.get(j) > rez)
                    rez = numb.get(i) * numb.get(j);
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(1346190));

    }
}

/*
You are given a positive integer n.

Return the maximum product of any two digits in n.

Note: You may use the same digit twice if it appears more than once in n.



        Example 1:

Input: n = 31

Output: 3

Explanation:

The digits of n are [3, 1].
The possible products of any two digits are: 3 * 1 = 3.
The maximum product is 3.
Example 2:

Input: n = 22

Output: 4

Explanation:

The digits of n are [2, 2].
The possible products of any two digits are: 2 * 2 = 4.
The maximum product is 4.
Example 3:

Input: n = 124

Output: 8

Explanation:

The digits of n are [1, 2, 4].
The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
The maximum product is 8.


Constraints:

        10 <= n <= 109
        */
