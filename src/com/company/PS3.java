package com.company;
import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {

        //Write a Java program to convert a string to lowercase
        Scanner sc = new Scanner(System.in);

        //System.out.print("Please enter any string to convert to lowercase: ");
        /*String a = sc.nextLine();
        System.out.println(a.toLowerCase());*/

        //Write a Java program to replace spaces with underscores.
        /*System.out.print("Please enter any string to replace spaces with underscore: ");
        String b = sc.nextLine();
        System.out.println(b.replace(' ','_'));*/

        //Write a Java program to fill in a letter template which looks like below:
/*
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Rohan"));
*/

        //Write a Java program to detect double and triple spaces in a string.
        String a = "Hello,  there are lot of   double and   triple  spaces in this  sentence!";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

    }
}
