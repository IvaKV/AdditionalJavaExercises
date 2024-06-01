package com.Brainster.Quest2;

import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Exercise 1: Sum of Reciprocal Values

//        System.out.println("Enter a natural number: ");
//        int n = input.nextInt();
//
//        if (n >= 1) {
//            double sum = 0;
//
//            for (int i = 1; i <= n; i++) {
//                double recValue = 1.0 / i;
//                sum = sum + recValue;
//            }
//            System.out.println("The sum of reciprocal values of the first " + n + " natural numbers is " + sum);
//        } else {
//            System.out.println("Invalid inout");
//        }

        // Exercise 2: Count and Add Even Number

//        System.out.println("Enter two integers: ");
//        int m = input.nextInt();
//        int n = input.nextInt();
//
//        int count = 0;
//        int sum = 0;
//        int spare;
//
//        if (m > n) {
//            spare = n;
//            n = m;
//            m = spare;
//        }
//
//        for (int i = m; i <= n; i++) {
//           if (i % 2 == 0) {
//               count++;
//               sum = sum + i;
//            }
//        }
//        System.out.println("The count of even numbers from " + m + " to " + n + " is " + count);
//        System.out.println("The sum of even numbers from " + m + " to " + n + " is " + sum);

        // Exercise 3: Count and Sum Positive Numbers in an Array

//        System.out.println("Enter number of elements in an array:");
//        int n = input.nextInt();
//
//        int[] elements = new int[n];
//        int count = 0;
//        int sum = 0;
//
//        for  (int i = 0; i < elements.length; i++) {
//            System.out.println("Enter a number as an element: ");
//            elements[i] = input.nextInt();
//
//            if (elements[i] > 0) {
//                count++;
//                sum = sum + elements[i];
//            }
//        }
//        System.out.println("The array has " + n + " elements");
//        System.out.println("The number of positive numbers in the sequence is " + count + " and their sum is " + sum);

        // Exercise 4: Print a Pattern

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // Exercise 5: Enter Elements into an Array

//        System.out.println("Enter number of elements in an array:");
//        int n = input.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter an element: ");
//            arr[i] = input.nextInt();
//        }
//
//        System.out.print("The elements of the array are: ");
//
//        for (int j=0; j< arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }

        // Exercise 6: Print Elements at Even Positions

//        System.out.println("Enter number of elements ");
//        int l = input.nextInt();
//        int[] arrElem = new int[l];
//
//        for (int i = 0; i < arrElem.length; i++) {
//            System.out.println("Enter an element: ");
//            arrElem[i] = input.nextInt();
//        }
//
//        System.out.print("Elements in the array that are in an even position are as follows:");
//
//        for (int j = 0; j <arrElem.length; j++) {
//            if (j % 2 == 0) {
//                System.out.print(arrElem[j] + " ");
//            }
//        }

        // Exercise 7: Print Characters at Odd Positions in a String - JAS PROBAV DA JA RESHAM SO ARRAY

//        System.out.println("Enter a String:");
//        String characters = input.nextLine();
//        char[] charArr = characters.toCharArray();
//
//        System.out.println("Characters in odd positions in the string are as follows: ");
//
//        for (int k = 0; k < charArr.length; k++) {
//            if (k % 2 != 0) {
//                System.out.println(charArr[k] + " ");
//            }
//        }

        //  VEZBATA BEZ ARRAY

//        System.out.println("Enter a string");
//        String characters2 = input.nextLine();
//        System.out.println("the characters at odd postitons are");
//        for (int i = 0; i < characters2.length(); i++) {
//            if (i % 2 != 0) {
//                System.out.println(characters2.charAt(i));
//            }
//        }

//        // Exercise 8: Check Prime Number
//
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        boolean isPrime = true;
//
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }

        // Exercise 9: Reverse a String

//        System.out.println("Enter a sentence: ");
//        String sentence2 = input.nextLine();
//
//        for (int i = sentence2.length() - 1; i >= 0; i--) {
//            System.out.print(sentence2.charAt(i));
//        }

        // so while loop

//        int x = sentence2.length() - 1;
//
//        while (x >= 0) {
//            System.out.print(sentence2.charAt(x));
//            x--;
//        }

//      // Exercise 10

//        System.out.println("Enter a string: ");
//        String sent = input.nextLine().toLowerCase();
//
//        int vowel = 0;
//        int consonant = 0;
//
//        for (int i = 0; i < sent.length(); i++) {
//            char characters = sent.charAt(i);
//
//            if ("aeiou".indexOf(characters) != -1){
//            vowel++;
//        } else if (Character.isLetter(characters)) {
//            consonant++;
//        }
//    }
//        System.out.println("Number of vowels: " + vowel);
//        System.out.println("Number of consonants: " + consonant);
}

}


