package org.vincent;

import static java.lang.Math.pow;

public class Exercise2 {
    static double PHI = 3.14159;

    public static int calculateCircleDiameter(int circleRadius){
        return(circleRadius*2);
    }

    public static double calculateCircleCircumference(int circleRadius){
        return(2*PHI*circleRadius);
    }

    public static double calculateCircleArea(int circleRadius){
        return(PHI*(pow(circleRadius,2)));
    }

    public static void exercise2Output(int circleRadius){
        System.out.println("Exercise 2: " +
                "\n" + "radius = " + circleRadius +
                "\n" + "phi = " + PHI +
                "\n" +"diameter = " + calculateCircleDiameter(circleRadius) +
                "\n" +"circumference = " + calculateCircleCircumference(circleRadius) +
                "\n" +"area = " + calculateCircleArea(circleRadius) +
                "\n"
        );
    }
}
