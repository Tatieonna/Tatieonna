package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        String grade = "";
        System.out.println("Enter your numerical score:");
        int numScore= scanner.nextInt();

        if(numScore >= 90){
            grade = "A";
        } else if (numScore>=80) {
            grade= "B";
        } else if (numScore>= 70) {
            grade = "C";
        }else if (numScore>= 60){
            grade="D";
        } else if (numScore< 60) {
            grade= "F";

        }
        System.out.println("Your grade is:");
        System.out.println(grade);


    }
}