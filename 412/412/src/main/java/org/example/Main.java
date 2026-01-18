package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();


        for(int i = 1; i <= n; ++i){
            if(i % 3 == 0 && i % 5 == 0)
                result.addLast("FizzBuzz");
            else
                if(i % 3 == 0)
                    result.addLast("Fizz");
                else
                    if(i % 5 == 0)
                        result.addLast("Buzz");
                    else {
                        result.addLast(String.valueOf(i));
                    }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        System.out.println(s.fizzBuzz(5));
    }
}