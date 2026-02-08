package org.example;

import java.util.*;

public class Main {
    public static boolean checkPrereq(Map<Integer, List<Integer>> prereqMap, Set<Integer> nums, int number){
        List<Integer> val = new ArrayList<>();

        val = prereqMap.get(number);

        if(val == null)
            return true;

        for(var i : val){
            if(!nums.contains(i))
                return false;
        }

        return true;
    }

    public static Map<Integer, List<Integer>> fillMap(Map<Integer, List<Integer>> prereqMap, int[][] prerequisites){
        List<Integer> val = new ArrayList<>();

        for(var i : prerequisites){
            if(prereqMap.containsKey(i[0])){
                val = prereqMap.get(i[0]);

                val.add(i[1]);

                prereqMap.put(i[0], val);
            }
            else{
                val = new ArrayList<>(){};
                val.add(i[1]);
                prereqMap.put(i[0], val);
            }
        }

        return prereqMap;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> nums = new HashSet<>();
        int setSize = -1;

        Map<Integer, List<Integer>> prereqMap = new HashMap<>();

        prereqMap = fillMap(prereqMap, prerequisites);



        while (true){
            if(nums.size() == setSize)
                break;

            setSize = nums.size();

            for(int i = 0; i < numCourses; ++i){
                if(!nums.contains(i)){
                    if(checkPrereq(prereqMap, nums, i)){
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