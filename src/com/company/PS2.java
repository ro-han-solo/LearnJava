package com.company;
import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //what will be the result of the following expression:
        /*float a = 7/4 * 9/2;
        float b = 7/4f * 9/2f;
        System.out.println(a);
        System.out.println(b);*/

        //Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        /*System.out.print("Please enter a grade: ");
        char c = sc.next().charAt(0);
        char encrypt = Character.toUpperCase((char) (c + 8));
        System.out.println("Your encrypted grade is '" + encrypt + "'.");
*/
        //Decrypt the grade
        /*System.out.print("Please enter encrypted grade: ");
        char d = sc.next().charAt(0);
        char decrypt = Character.toUpperCase((char) (d - 8));
        System.out.println("Your decrypted grade is '" + decrypt + "'.");*/

        //Diversion: Typecasting practice
/*
        int a = 15;
        a = (int)(15+12.5);
        System.out.println(a);
*/
        //Use comparison operators to find out whether a given number is greater than the user entered number or not.
        int a = 5;
        int b = 10;
        System.out.println(a>b);
    }
}
