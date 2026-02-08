package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean checkPrereq(int[][] prerequisites, Set<Integer> nums ,int number){
        for(var i : prerequisites){
            if(i[0] == number){
                if(!nums.contains(i[1])){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> nums = new HashSet<>();
        int setSize = -1;

        while (true){
            if(nums.size() == setSize)
                break;

            setSize = nums.size();

            for(int i = 0; i < numCourses; ++i){
                if(!nums.contains(i)){
                    if(checkPrereq(prerequisites, nums, i)){
                        nums.add(i);
                    }
                }
            }
        }

        if(nums.size() == numCourses)
            return true;
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(canFinish());
    }
}