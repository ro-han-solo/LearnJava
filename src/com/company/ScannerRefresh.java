package com.company;

import java.util.Scanner;

public class ScannerRefresh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String str = sc.nextLine();
        System.out.println("Hi " + str + ", nice to meet you!" );
    }
}
