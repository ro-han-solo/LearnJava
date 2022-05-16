package com.company;

import  java.util.Scanner;

public class ScannerLearn {
    public static void main(String[] args) {
        /*System.out.println("please enter your name:");

        System.out.print("Enter number 1: ");
        int a = rohan.nextInt();
        System.out.print("Enter number 2: ");
        int b = rohan.nextInt();
        int sum = a+b;
        System.out.println("The sum of the 2 numbers is "+ sum);*/

        Scanner rohan = new Scanner(System.in);
        /*System.out.print("Enter any integer: ");

        boolean abc = rohan.hasNextInt();

        if (abc == true) {
            System.out.println("You've entered a valid input");}
        else{
            System.out.println("Please enter an integer");
        }*/

        /*System.out.println("Taking input from the user ");
        String str = rohan.nextLine();
        System.out.println(str);*/

        //Program to calculate the percentage of a student:

        /*System.out.print("Please enter your marks in Maths: ");
        int a = rohan.nextByte();
        System.out.print("Please enter your marks in English: ");
        int b = rohan.nextByte();
        System.out.print("Please enter your marks in Science: ");
        int c = rohan.nextByte();
        System.out.print("Please enter your marks in Social Studies: ");
        int d = rohan.nextByte();
        System.out.print("Please enter your marks in Gujarati: ");
        int e = rohan.nextByte();

        int sum = a+b+c+d+e;
        int percent = (sum*100)/500;
        System.out.println("Your percentage is "+ percent + "%");*/

        double a = 50.76;
        double b = 70;
        double avg = ((a+b)/200)*100;
        System.out.println(avg);

    }
}
