package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Fizzbuzz- take user input 1-100, if multiple of 3 output "fizz"
        // if multiple of 5 output buzz
        //if both output fizzbuzz
        // if neither output the number
//        int userNumber = input.nextInt();
//        String number = input.nextLine();
//            if(userNumber % 3 == 0 && userNumber % 5 == 0) {
//                System.out.println("Fizzbuzz!!");
//            }
//
//            else if (userNumber % 5 == 0) {
//                System.out.println("Buzz!");
//            }
//
//            else if (userNumber % 3 == 0) {
//                System.out.println("Fizz!");
//            }
//            else {
//                System.out.println(userNumber);
//            }
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && 1 % 5 == 0) {
//                System.out.println("Fizzbuzz!");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz!");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz!");
//            } else {
//                System.out.println(i);


       String grade = input.nextLine();
        int myGrade = input.nextInt();
        if (myGrade < 45) {
            System.out.println(" F ");

        } else if (myGrade < 49 && myGrade > 45) {
            System.out.println(" D" );
        } else if (myGrade < 59 && myGrade > 50 ) {
            System.out.println(" C ");
        } else if (myGrade < 80 && myGrade > 60) {
            System.out.println(" B ");
        } else if (myGrade > 80) {
            System.out.println(" A ");
        }
        }

        }

