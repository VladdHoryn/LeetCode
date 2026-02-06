package org.example;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static class Pair {
        Integer first;
        Integer second;

        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void removeIcland(int y, int x, char[][] grid){
        Queue<Pair> queue = new ArrayDeque<>();

        queue.add(new Pair(y, x));

        Pair current;

        while (!queue.isEmpty()){
            current = queue.poll();
            grid[current.first][current.second] = '0';

            if(current.second - 1 >= 0 && grid[current.first][current.second-1] == '1')
                queue.add(new Pair(current.first, current.second-1));
            if(current.second + 1 < grid[0].length && grid[current.first][current.second+1] == '1')
                queue.add(new Pair(current.first, current.second+1));
            if(current.first - 1 >= 0 && grid[current.first-1][current.second] == '1')
                queue.add(new Pair(current.first-1, current.second));
            if(current.first + 1 < grid.length && grid[current.first+1][current.second] == '1')
                queue.add(new Pair(current.first+1, current.second));
        }
    }

    public static int numIslands(char[][] grid) {
        int step = 0, res = 0;

        for(var i : grid){
            for(int j = 0; j < i.length; ++j){
                if(grid[step][j] == '0')
                    continue;
                removeIcland(step, j, grid);
                ++res;
            }
            ++step;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        }));
    }
}