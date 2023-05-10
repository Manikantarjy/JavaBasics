package com.ManiTheTester.Arrays;

import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {


    /*Arrays are data structure,
    it stores multiple values inside one variable with same data type and fixed/Static.
    These are building blocks for all other data structures */

        int[] numbers = new int[3];  // it will create an array with 3 values
        numbers[0] = 1;
        numbers[1] = 22;
        numbers[2] = 4;
        System.out.println(Arrays.toString(numbers)); // if we don't give Arrays.toString: it will print the memory location instead of value
        System.out.println(numbers.length);

        //Another way(Shorthand version): directly we can assign the values
        int[] numbers2 = {0,2,4,6,8};
        System.out.println(Arrays.toString(numbers2));

        numbers2[2]= 45;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        String[] names = {"Mani", "Raju", "Lakshmi"};
        System.out.println(Arrays.toString(names));
    //Array with null values:
        //For primitives: default value is 0
        int[] numb = new int[3];
        System.out.println(Arrays.toString(numb));
        numb[2]=9;
        //For objects/Reference types
        String[] name = new String[3];
            Arrays.fill(name,"foo");

        name[1] = "Jose";
       // System.out.println(Arrays.toString(name));

       // Arrays.fill(numb, -1);

        System.out.println(Arrays.toString(name));
    }

}
