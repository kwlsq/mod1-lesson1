package org.vincent;

public class Exercise5 {
    public static void extractNameInitials(String fullName){
        String[] name = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for(String brokeDownName : name){
            initials.append(brokeDownName.charAt(0));
        }

        System.out.println("Exercise 5: " +
                "\n" + "full name = " + fullName +
                "\n" + "initial = " + initials +
                "\n"
        );
    }
}
