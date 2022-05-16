package com.company;

import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, Welcome to the percentage calculator. Let's start with your name: ");
        String str = sc.nextLine();
        System.out.println("Hi " + str + ", please let us know the maximum score per subject: ");
        double max = sc.nextDouble();
        sc.nextLine();
        double i = 0;
        double total = 0;
        while (i <= 15) {
            System.out.println("Please enter subject name: ");
            String sub = sc.nextLine();
            System.out.println("Please enter the marks you received in " + sub + " out of " + max + ": ");
            double marks = sc.nextDouble();
            total+= marks;
            ++i;
            sc.nextLine();
            System.out.println("Do you want to continue? Please enter '1' for YES or '2' for NO: ");
            int resp = sc.nextInt();
            sc.nextLine();
            if(resp == 1){
                if (i > 15){
                    System.out.println("We're sorry, you can only enter up to a maximum of 15 subjects!");
                    double percentage = (total/(max*i))*100.0;
                    System.out.println("You have received " + percentage + "%" );
                    break;
                }
            } else if (resp == 2){
                double percentage = (total/(max*i))*100.0;
                System.out.println("You have received " + percentage + "%" );
                break;
            }
        }
    }
}
