package org.vincent;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.lang.Math.pow;

public class Main {
    static double PHI = 3.14159;
    //Exercise 1
    public static void calculateRectangleArea(int rectangleLength, int rectangleWidth){
        System.out.println("Exercise 1: " +
                "\n" + "length = " + rectangleLength +
                "\n" + "width = " + rectangleWidth +
                "\n" + "area = " + (rectangleLength * rectangleWidth) +
                "\n"
        );
    }

    //Exercise 2
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

    //Exercise 3
    public static void calculateTriangleAngle(int firstAngle, int secondAngle){
        System.out.println(180-(firstAngle+secondAngle));
    }

    //Exercise 4
    public static void calculateDateDifference(String dateBefore, String dateAfter){
        LocalDate dateBeforeConverted = LocalDate.parse(dateBefore, DateTimeFormatter.ISO_DATE);
        LocalDate dateAfterConverted = LocalDate.parse(dateAfter, DateTimeFormatter.ISO_DATE);
        System.out.println(ChronoUnit.DAYS.between(dateBeforeConverted,dateAfterConverted));
    }

    //Exercise 5
    public static void extractNameInitials(String fullName){
        String[] name = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for(String brokeDownName : name){
            initials.append(brokeDownName.charAt(0));
        }

        System.out.println(initials);
    }

    public static void main(String[] args) {
        calculateRectangleArea(5,3);

        exercise2Output(5);


        calculateTriangleAngle(80,65);

        calculateDateDifference("2024-03-19","2024-03-21");

        extractNameInitials("John Doe");
    }
}