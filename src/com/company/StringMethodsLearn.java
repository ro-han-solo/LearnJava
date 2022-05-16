package com.company;

import java.util.Locale;

public class StringMethodsLearn {
    public static void main(String[] args) {

        String name = "Rohan";
        /*System.out.println(name);
        int value = name.length();
        System.out.println(value);*/

        /*System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String name1 = "  Hello  ";
        System.out.println(name1.trim());*/
/*
        System.out.println(name.substring(1).toUpperCase());
        System.out.println(name.substring(1,4));
        System.out.println(name.substring(1,5)); //this will work even if there's no index 5 in Rohan.
        //this wouldn't work
        //System.out.println(name.substring(1,6)); */
/*
        System.out.println(name.replace('R','J'));
        System.out.println(name.replace("han","nom"));*/
/*

        System.out.println(name.startsWith("Ron"));
        System.out.println(name.startsWith("Roh"));
        System.out.println(name.startsWith("roh"));
*/
/*
        System.out.println(name.endsWith("han"));
        System.out.println(name.endsWith("hah"));
        System.out.println(name.endsWith("Han"));*/

        //System.out.println(name.charAt(2));
        //returns error
        //System.out.println(name.charAt(5));

        //String name2 = "RohanRohan";
        /*System.out.println(name2.indexOf("an"));
        System.out.println(name2.indexOf("an",4));*/
/*
        System.out.println(name2.lastIndexOf("han"));
        System.out.println(name2.lastIndexOf("an",4));*/

        /*System.out.println(name.equals("Rohan"));
        System.out.println(name.equals("Harry"));*/

        /*System.out.println(name.equalsIgnoreCase("ROHAN"));
        System.out.println(name.equalsIgnoreCase("rOhAn"));*/

        //Escape sequence characters
        System.out.println("Need to add a double quote \" in here and a back slash \\ here.");
    }
}
