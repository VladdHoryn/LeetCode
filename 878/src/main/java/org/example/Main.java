package org.example;

public class Main {
    public static int getMod(int number){
        return number % 1000000007;
    }

    public static int nthMagicalNumber(int n, int a, int b) {
        a = getMod(a);
        b = getMod(b);
        int first = a, second = b;

        int step = 0, rez = 0;

        while (step < n){
            if(first > second){
                rez = second;
                second = getMod(second + b);
            }
            else
                if(first < second){
                    rez = first;
                    first = getMod(first + a);
                }
                else{
                    rez = first;
                    first = getMod(first + a);
                    second = getMod(second + b);
                }

            ++step;
        }


        return rez;
    }

    public static void main(String[] args) {
        System.out.println(nthMagicalNumber(8, 3, 5));
    }
}

/*
A positive integer is magical if it is divisible by either a or b.

Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large, return it modulo 109 + 7.



Example 1:

Input: n = 1, a = 2, b = 3
Output: 2
Example 2:

Input: n = 4, a = 2, b = 3
Output: 6


Constraints:

        1 <= n <= 109
        2 <= a, b <= 4 * 104
        */
