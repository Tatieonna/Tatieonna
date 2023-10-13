package org.example;

public class Main {
    public static void main(String[] args) {

      // for loop
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number:" + i);
            }
        }
    }
        { //while loop
            int number = 1;
            while (number <= 19) {
                if (number % 2 != 0) {
                    System.out.println("Odd number:" + number);

                }
                number++;

            }
        }
    }
