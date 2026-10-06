package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

class Point implements Comparable<Point> {
    public int x;
    public int y;
    public String name;

    Point(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    private double clcDist(){
        return sqrt(x*x + y*y);
    }

    @Override
    public int compareTo(Point o) {
        if(this.clcDist() < o.clcDist())
            return -1;
        else if(this.clcDist() > o.clcDist())
            return 1;
        return this.name.compareTo(o.name) ;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y + " " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{new Point(1,4,"A"), new Point(4,-1,"B"),
                new Point(5,-1,"C"), new Point(2,1,"D")};

        Arrays.sort(points);

        System.out.println(Arrays.toString(points));
    }
}
/*
An array of points is given. Each point has x and y coordinates and a point name. Sort the points
in the array in ascending order of the point's distance from the origin (if the distance is the
same - in ascending order by the name field) and print them on the screen
 */