package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("Do you want to A, S, M, or D ?");
        scanner.nextLine(); // prevent the scanner from reading \n from the last input
        String userOperation = scanner.nextLine();

        if (userOperation.equalsIgnoreCase("A")) {
          double result = firstNumber + secondNumber;
          System.out.printf("%.2f + %.2f = %.2f", firstNumber, secondNumber, result);
        }
        if (userOperation.equalsIgnoreCase("S")){
            double result = firstNumber - secondNumber;
            System.out.printf("%.2f - %.2f = %.2f", firstNumber, secondNumber, result);
        }
        if (userOperation.equalsIgnoreCase("M")){
            double result = firstNumber * secondNumber;
            System.out.printf("%.2f * %.2f = %.2f", firstNumber, secondNumber, result);
        }
        if (userOperation.equalsIgnoreCase("D")){
            double result = firstNumber / secondNumber;
            System.out.printf("%.2f / %.2f = %.2f", firstNumber, secondNumber, result);
        }


    }

    }
