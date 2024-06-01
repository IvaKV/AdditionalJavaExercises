package com.Brainster.Quest1;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Exercise 1: Number Classification

//        System.out.print("Please enter an integer: ");
//        int num = input.nextInt();
//
//        if (num < 0) {
//            System.out.println("The number num " + number + " is a negative number");
//        } else if (numb == 0) {
//            System.out.println("The number num " + number + " is neither positive nor negative");
//        } else {
//            System.out.println("The number num " + number + " is a positive number");
//        }

        //Exercise 2: Number Type Checker

//        System.out.println("Please enter a number: ");
//        int number1 = input.nextInt();
//
//        if (number1 < 1) {
//            System.out.println("Invalid input please enter a positive integer ");
//        } else if (number1 % 2 == 0) {
//            System.out.println("The number " + number1 + " is an even number");
//        } else {
//            System.out.println("The number " + number1 + " is an odd number");
//        }

        // istata vezba ama od danica

//        System.out.println("Please enter a number: ");
//        int number1 = input.nextInt();
//
//        if (number1 > 0) {
//            if (number1 % 2 == 0) {
//                System.out.println("The number is an even number");
//            } else {
//                System.out.println("The number is an odd number");
//            }
//        } else {
//            System.out.println("Invalid input please enter a positive integer");
//        }


        //Exercise 3: Number Comparison

//        System.out.println("Enter three numbers: ");
//        int number3 = input.nextInt();
//        int number4 = input.nextInt();
//        int number5 = input.nextInt();
//
//        System.out.println("Numbers entered: " + number3 + " " + number4 + " " + number5);
//
//        int smallest, largest;
//
//        if (number3 <= number4 && number3 <= number5) {
//            smallest = number3;
//            System.out.println("The smallest number is: "+ smallest);
//        } else if (number4 <= number5 && number4 <= number3) {
//            smallest = number4;
//            System.out.println("The smallest number is: "+ smallest);
//        } else {
//            smallest = number5;
//            System.out.println("The smallest number is: "+ smallest);
//        }
//
//        if (number3 >= number4 && number3 >= number5) {
//            largest = number3;
//            System.out.println("The largest number is: "+ largest);
//        } else if (number4 >= number5 && number4 >= number3) {
//            largest = number4;
//            System.out.println("The largest number is: "+ largest);
//        } else {
//            largest = number5;
//            System.out.println("The largest number is: "+ largest);
//        }

        // istava vezba prereshena so Danica

//        System.out.println("Enter three numbers");
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();
//        int num5 = input.nextInt();
//
//        if (num3 == num4 && num3 == num5) {
//            System.out.println("There is no largest or smallest number");
//        } else {
//            int smallest = num3;
//            int largest = num3;
//
//            if (num4 < smallest) {
//                smallest = num4;
//            } else if (num4 > largest){
//                largest = num4;
//            }
//
//            if (num5 < smallest) {
//                largest = num5;
//            } else if (num5 > largest){
//                largest = num5;
//            }
//            System.out.println("The numbers entered are: " + num3 + ", " + num4 + ", " + num5);
//            System.out.println("The lasrgest number is " + largest);
//            System.out.println("The smallest number is " + smallest);
//        }

        // ushte edno reshenie

//        System.out.println("Enter three numbers");
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();
//        int num5 = input.nextInt();
//
//         int smallest;
//         int largest;
//         smallest = Math.min(Math.min(num3, num4), num5);
//         largest = Math.max(Math.max(num3, num4), num5);
//
//        System.out.println("The largest number is " + largest);
//        System.out.println("The smallest number is " + smallest);

        //Exercise 4: Leap Year Checker

//        System.out.println("Please enter the number of days for the current year:  ");
//        int number6 = input.nextInt();
//
//        if (number6 == 365) {
//            System.out.println("This year has got " + number6 + " days");
//        } else if (number6 == 366) {
//            System.out.println("It is a leap year!");
//        } else if (number6 > 366) {
//            System.out.println("A year cannot contain more than 366 days");
//        } else {
//            System.out.println("This is not a valid input for days in a year");
//        }

        // Exercise 5: Arithmetic Operation

//        System.out.println("Enter the first number: ");
//        double number7 = input.nextInt();
//
//        System.out.println("Enter the second number: ");
//        double number8 = input.nextInt();
//
//        input.nextLine();
//
//        System.out.println("Enter the operator: ");
//        String operator = input.nextLine();
////         ova e za character da vnese korisnikot =>
////         char operator = input.nextLine().charAt(0);
//
//        double result;
//
//        switch (operator) {
//
//            case "+":
//                result = number7 + number8;
//                System.out.println("The product of the numbers " + number7 + " and " + number8 + " is " + result);
//                break;
//            case "-":
//                result = number7 - number8;
//                System.out.println("The product of the numbers " + number7 + " and " + number8 + " is " + result);
//                break;
//            case "*":
//                result = number7 * number8;
//                System.out.println("The product of the numbers " + number7 + " and " + number8 + " is " + result);
//                break;
//            case "/":
//                if (number8 == 0) {
//                    System.out.println("Division by 0 is not allowed. Please enter a number not equal to 0");
//                } else {
//                    result = number7 / number8;
//                    System.out.println("The product of the numbers " + number7 + " and " + number8 + " is " + result);
//                }
//                break;
//            case "%":
//                result = number7 % number8;
//                System.out.println("The product of the numbers " + number7 + " and " + number8 + " is " + result);
//                break;
//            default:
//                System.out.println("Invalid operator. Please enter a valid operator");
//        }

        //Exercise 6:
//        System.out.println("Enter student's score: ");
//        int score = input.nextInt();
//
//        if (score < 0 || score > 100) {
//            System.out.println("Enter a score within the range of 0 to 100");
//        } else if (score >= 90) {
//            System.out.println("The student's grade is A!");
//        } else if (score >= 80 && score <= 89) {
//            System.out.println("The student's grade is B!");
//        } else if (score >= 70 && score <= 79) {
//            System.out.println("The student's grade is C!");
//        } else if (score >= 60 && score <= 69) {
//            System.out.println("The student's grade is D!");
//        } else {
//            System.out.println("The student's grade is F!. They Failed!");
//        }

        // Exercise 7: Traffic Light Simulator ==> ja reshiv i so IF i so SWITCH

//        System.out.println("Enter a color (red, yellow or green): ");
//        String color = input.nextLine();
//        color = color.toLowerCase();

        // reshenie so IF

//        if (color.equals("green")) {
//            System.out.println("Go!");
//        } else if (color.equals("red")) {
//            System.out.println("Stop!");
//        } else if (color.equals("yellow")) {
//            System.out.println("Slow down!");
//        } else {
//            System.out.println("Invalid Traffic Light color. Please enter red, green or yellow");
//        }

        // Reshenie so SWITCH

//        switch (color) {
//            case "red":
//                System.out.println("Stop!");
//                break;
//            case "green":
//                System.out.println("Go!");
//                break;
//            case "yellow":
//                System.out.println("Slow down!");
//                break;
//            default:
//                System.out.println("Invalid Traffic Light color. Please enter red, green or yellow");
//        }

        // Exercise 8: Ticket Price Calculator

//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//
//        if (age >= 0 && age <= 12) {
//            System.out.println("The price of the ticket is 5$.");
//        } else if (age > 12 && age < 65) {
//            System.out.println("The price of the ticket is 10$.");
//        } else if (age >= 65 && age < 110) {
//            System.out.println("The price of the ticket is 7$.");
//        } else {
//            System.out.println("Invalid input. Please enter a valid number for age!");
//        }

        // drugo reshenie
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//        int ticketPrice = 0;
//
//        if (age >= 0 && age <= 12) {
//            ticketPrice = 5;
//        } else if (age > 12 && age < 65) {
//            ticketPrice = 10;
//        } else if (age >= 65 && age < 110) {
//            ticketPrice = 7;
//        } else {
//            System.out.println("Invalid input. Please enter a valid number for age!");
//        }
//        System.out.println("The price of the ticket is " + ticketPrice + " $.");

        //Exercise 9: Arithmetic Mean Checker

//        System.out.println("Enter five numbers: ");
//        int number9 = input.nextInt();
//        int number10 = input.nextInt();
//        int number11 = input.nextInt();
//        int number12 = input.nextInt();
//        int number13 = input.nextInt();
//
//
//        int mean = (number9 + number10 + number11 + number12 + number13) / 5;
//        System.out.println("The arithmetic mean is " + mean);
//
//        if (mean >= 15) {
//            double meanDevided = mean / 5;
//            System.out.println("The arithmetic mean is greater than 15. Dividing by 5.");
//            System.out.println("The final arithmetic mean is " + meanDevided);
//        } else {
//            double meanDevided2 = mean % 2;
//            System.out.println("The arithmetic mean is not greater than 15. Dividing by 2.");
//            System.out.println(" The final arithmetic mean is " + meanDevided2);
//        }

        // THE SAME EXERCISE USING FOR LOOP - vaka da ja resham mi beshe malce teshko
//        System.out.println("Enter the number of values: ");
//        int numberOfValues = input.nextInt();
//
//        double sum = 0;
//
//        for (int i = 1; i <= numberOfValues; i++) {
//            System.out.println("Enter value number " + i + ": ");
//            int value = input.nextInt();
//            sum = sum + value;
//        }
//        double mean = sum / numberOfValues;
//        System.out.println("The arithmetic mean is " + mean);
//
//        if (mean >= 15) {
//            mean = mean / 5;
//            System.out.println("The arithmetic mean is greater than 15. Dividing by 5.");
//            System.out.println("The final arithmetic mean is " + mean);
//        } else {
//            mean = mean % 2;
//            System.out.println("The arithmetic mean is not greater than 15. Dividing by 2.");
//            System.out.println(" The final arithmetic mean is " + mean);
//        }

        // Exercise 10: Name and Age Checker

//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//        name = name.toLowerCase();
//
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//
//        if (name.equals("anna")) {
//            System.out.println("\"" + name.toUpperCase() + "\"");
//        } else if (name.equals("mary")) {
//            System.out.println("\"" + name.toLowerCase() + "\"");
//        } else {
//            String firstLetter = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();  // Ova go najdov na google za prvata bukva da bide golema
//            System.out.println("\"" + firstLetter + "\"");
//        }
//
//        if (age >= 18 && age < 120) {
//            System.out.println("You are an adult!");
//        } else if (age >= 0 && age < 18) {
//            System.out.println("You are not an adult!");
//        } else {
//            System.out.println("Invalid input for age. Please enter it again!");
//        }

        //Exercise 11: Value Swapper

//        System.out.println("Enter the first number: ");
//        int firstNumber = input.nextInt();
//        System.out.println("Enter the second number:");
//        int secondNumber = input.nextInt();
//
//        System.out.println("Before swapping x = " +  firstNumber + ", y = " + secondNumber);
//
//        int extra = firstNumber;
//        firstNumber = secondNumber;
//        secondNumber = extra;
//
//        System.out.println("After swapping x = " + firstNumber + ", y = " + secondNumber);

        // Exercise 12: Day Checker

//        System.out.println("Enter a day of the week: ");
//        String day = input.nextLine();
//        day = day.toLowerCase();
//
//        switch (day) {
//            case "monday":
//            case "tuesday":
//            case "wednesday":
//            case "thursday":
//            case "friday":
//                System.out.println(day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase() + " is a weekday.");
//                break;
//            case "saturday":
//            case "sunday":
//                System.out.println(day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase() + " is a weekend.");
//                break;
//            default:
//                System.out.println("Invalid input. Try again!");
//        }

        // Exercise 13: Discount Calculator

//        System.out.println("Enter the purchase amount");
//        int amount = input.nextInt();
//        double discount;
//
//        if (amount >= 1 && amount <= 1000) {
//            discount = amount - (5.0 / 100.0) * amount;
//            System.out.println("Final bill after 5% discount: " + discount);
//        } else if (amount > 1000 && amount <= 5000) {
//            discount = amount - (10.0 / 100.0) * amount;
//            System.out.println("Final bill after 10% discount: " + discount);
//        } else if (amount > 5000 && amount <= 100000) {
//            discount = amount - (15.0 / 100.0) * amount;
//            System.out.println("Final bill after 10% discount: " + discount);
//        } else {
//            System.out.println("Invalid input. Please enter a valid purchase amount");
//        }


        // Exercise 14: Time Converter

//        System.out.println("Enter the number of seconds: ");
//        int seconds = input.nextInt();
//
//        int days = seconds / (24 * 3600);
//        int remainingSec = seconds % (24 * 3600);
//        int hours = remainingSec / 3600;
//        int remainingSec2 = remainingSec % 3600;
//        int minutes = remainingSec2 / 60;
//        int finalSec = remainingSec2 % 60;
//
//        if (seconds >= 0) {
//            System.out.println(seconds + " seconds is equal to " + hours + " hour(s), " + minutes + " minute(s), and " + finalSec + " second(s)");
//        } else {
//            System.out.println("Invalid inout for seconds! Try again!");
//        }

        // Exercise 15: Username and Password Checker

//        String userName = "user123";
//        String password = "pass123";
//        String userInput;
//        String passInput;
//
//        do {
//            System.out.println("Enter your username: ");
//            userInput = input.nextLine();
//
//            System.out.println("Enter your password: ");
//            passInput = input.nextLine();
//            if (!userName.equals(userInput) && !password.equals(passInput)) {
//                System.out.println("Username or password is incorrect!");
//            }
//        } while (!userName.equals(userInput) && !password.equals(passInput));
//
//            System.out.println("You have successfully logged in!");

    }
}
