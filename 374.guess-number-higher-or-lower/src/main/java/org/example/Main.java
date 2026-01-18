package org.example;

public class Main {
    public static int guess(long pick){
        System.out.println(pick);

        int guessedNum = 1702766719; //Magical number

        if(pick > guessedNum)
            return -1;
        if(pick < guessedNum)
            return 1;
        return 0;
    }

    public static int guessNumber(int n) {
        long l = 1, r = n, pick;
        int mid;

        while(l <= r)
        {
            mid = (int) ((l + r) / 2);

            pick = guess(mid);

            if(pick == -1){
                r = mid - 1;
            }
            else
            if(pick == 1){
                l = mid + 1;
            }
            else
                return mid;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + guessNumber(2126753390));
    }
}
/*
374. Guess Number Higher or Lower
Solved
Easy
Topics
premium lock icon
Companies
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.



Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1


Constraints:

1 <= n <= 231 - 1
1 <= pick <= n
 */