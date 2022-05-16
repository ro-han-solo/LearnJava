package com.company;
import java.util.Scanner;

public class PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Please enter your name:");
        String a = sc.nextLine();
        System.out.println("Hello "+ a+ ", have a good day!");*/

        // Convert kilometers to miles
        /*System.out.print("Please enter a value in kilometers: ");
        double d = sc.nextDouble();
        double converter = d/1.6;
        System.out.println(d+ " kilometers will be "+converter+ " miles.");*/

        // Whether the number is integer or not
        /*System.out.println("Please enter a number: ");
        boolean a = sc.hasNextInt();
        if (a==false){
            System.out.println("This input is not an integer. Please enter an integer!");
        }
        else{
            System.out.println("This input is valid.");
        }*/
        // Percentage Calculator
        System.out.println("Hi, Welcome to the percentage calculator. Let's start with your name: ");
        String str = sc.nextLine();
        System.out.println("Hi " + str + ", please let us know the maximum score per subject: ");
        int max = sc.nextInt();
        sc.nextLine();
        int i = 0;
        double total = 0.0;
        while (i <= 15) {
            System.out.println("Please enter subject name: ");
            String sub = sc.nextLine();
            System.out.println("Please enter the marks you received in " + sub + " out of " + max + ": ");
            double marks = sc.nextDouble();
            total = total+marks;
            total++;
            i++;
            sc.nextLine();
            System.out.println("Do you want to continue? Please enter '1' for YES or '2' for NO: ");
            int resp = sc.nextInt();
            sc.nextLine();
            if(resp == 1){
                if (i > 15){
                    System.out.println("We're sorry, you can only enter upto a maximum of 15 subjects!");
                    double percentage = (total*100)/(max*i);
                    System.out.println("You have received " + percentage + "%" );
                    break;
                } else{
                    continue;
                }
            } else if (resp == 2){
                double percentage = (total*100)/(max*i);
                System.out.println("You have received " + percentage + "%" );
                break;
            }
        }
        /*System.out.println("Please enter subject name: ");
        String sub1 = sc.nextLine();
        System.out.println("Please enter the marks you received in " + sub1 + " out of " + max + ": ");
        int sub1marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter subject name: ");
        String sub2 = sc.nextLine();
        System.out.println("Please enter the marks you received in " + sub2 + " out of " + max + ": ");
        int sub2marks = sc.nextInt();
        sc.nextLine();*/
    }
}