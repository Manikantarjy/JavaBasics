package com.ManiTheTester.Miscellaneous;

import java.sql.SQLOutput;

public class StringsPractise {

    public static void main(String[] args) {
    //Strings allows to store sequence of characters , Any text we need to put in double quotes: " "

        /*The String class is immutable, so that once it is created a String object cannot be changed.
        The String class has a number of methods, some of which will be discussed below,
         that appear to modify strings. Since strings are immutable,
       what these methods really do is create and return a new string that contains the result of the operation.*/

    String amigos = "Amigos";
    String code = "code";
    String brand = amigos + code;

        System.out.println(amigos.charAt(3));

        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(6));
        System.out.println(brand.substring(0,6));

        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("  a  ".trim());  //Trims the extra spaces

    }
}
