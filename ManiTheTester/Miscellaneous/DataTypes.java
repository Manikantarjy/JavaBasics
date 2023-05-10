package com.ManiTheTester.Miscellaneous;

public class DataTypes {

    public static void main(String[] args) {


   /*Primitive data types: It allows us to store simple values, for example: whole numbers, decimal values and characters
    Here are the available data types for primitives in java:
    -> boolean, byte, short, char, int, long, float, double

    We mostly use boolean, char, int, long(rarely), float and double
    */
//primitives
        int number1 = 20;
        int number2 = 30;
        int result = number1 + number2;
        System.out.println(result);
        double pi = 3.14;   //stores decimal numbers
        float f = 1.46748f; //stores decimal numbers
        boolean isAdult = true;
        char a = 'A';
        byte n = 127;  //it will support till 127 only
        short s = 3300;  //only till 32768
        //int will store till 2147483647  : if we have number bigger than this, then we use long

        System.out.println("------------");
        //representation of integers & Decimals in better way using underscores

        int amount = 1_000_000_008;
        System.out.println(amount);

        double amt = 1_000.31;
        System.out.println(amt);

        //Arithmetic operators : +, -, x, / , % (modular division)

            int num1 = 10;
            int num2 = 3;
        System.out.println(num1+num2);
        System.out.println(num1-num2);  //shortcut: cntrl+d to duplicate the line below
        System.out.println(num1*num2);
        System.out.println(num1%num2);  // remainder
        System.out.println(num1/num2);  //quotient

        //BODMAS rule
        System.out.println((2+2) * (3/1) *2);

    }
}
