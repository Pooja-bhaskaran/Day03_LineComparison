package com.Bridgelabz;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to LineComparison Computation");
        int x1 = 2, x2 =5, y1=2, y2=4;
        double lengthOfPoints ;
        lengthOfPoints = Math.sqrt(x2-x1) * (y2-y1);
        System.out.println("Length of the line is : " + lengthOfPoints);
    }
}
