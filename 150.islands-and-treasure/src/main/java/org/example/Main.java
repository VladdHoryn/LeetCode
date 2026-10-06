package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

class  Pair{
    int x = 0;
    int y = 0;
    int step = 0;

    Pair(int x, int y, int step){
        this.x = x;
        this.y = y;
        this.step = step;
    }
    Pair(){
    }
}

public class Main {
    public static void islandsAndTreasure(int[][] grid) {
        if(grid == null || grid.length == 0)
            return;
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new ArrayDeque<>();

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if(grid[i][j] == 0){
                    queue.add(new Pair(i, j, 0));
                }
            }
        }

        Pair curPair = new Pair();

        while (!queue.isEmpty()){
            curPair = queue.poll();

            if(curPair.x - 1 >= 0){
                if(grid[curPair.x-1][curPair.y] == Integer.MAX_VALUE) {
                    grid[curPair.x-1][curPair.y] = curPair.step + 1;
                    queue.add(new Pair(curPair.x - 1, curPair.y, curPair.step + 1));
                }
            }
            if(curPair.x + 1 < n){
                if(grid[curPair.x+1][curPair.y] == Integer.MAX_VALUE) {
                    grid[curPair.x+1][curPair.y] = curPair.step + 1;
                    queue.add(new Pair(curPair.x + 1, curPair.y, curPair.step + 1));
                }
            }
            if(curPair.y - 1 >= 0){
                if(grid[curPair.x][curPair.y-1] == Integer.MAX_VALUE) {
                    grid[curPair.x][curPair.y-1] = curPair.step + 1;
                    queue.add(new Pair(curPair.x, curPair.y - 1, curPair.step + 1));
                }
            }
            if(curPair.y + 1 < m){
                if(grid[curPair.x][curPair.y+1] == Integer.MAX_VALUE) {
                    grid[curPair.x][curPair.y+1] = curPair.step + 1;
                    queue.add(new Pair(curPair.x, curPair.y + 1, curPair.step + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] grid = new int[][]{
                {2147483647,-1,0,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647,-1,2147483647,-1},
                {0,-1,2147483647,2147483647},
                {0,-1,2147483647,2147483647},
                {0,-1,2147483647,2147483647},
                {0,-1,2147483647,2147483647}
        };

        islandsAndTreasure(grid);

        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}