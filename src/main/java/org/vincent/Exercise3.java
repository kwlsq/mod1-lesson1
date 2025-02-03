package org.vincent;

public class Exercise3 {
    public static void calculateTriangleAngle(int firstAngle, int secondAngle){
        int thirdAngle = (180-(firstAngle+secondAngle));
        System.out.println("Exercise 3: " +
                "\n" + "first angle = " + firstAngle +
                "\n" + "second angle = " + secondAngle +
                "\n" + "third angle = " + thirdAngle +
                "\n"
        );
    }
}
