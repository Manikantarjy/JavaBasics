package com.ManiTheTester.Miscellaneous;

import java.awt.*;

public class ReferenceType {

    public static void main(String[] args) {
   //Reference types: These allows us to store more complex values..
   //we need to create object for this to use reference variables

   /*
   * Diff bw primitive and Reference types
   * For Primitives the values itself be stored within the Memory Stack
   * For Objects, it stores the reference where the obj lives inside of the heap
   * For strings, it will store the value in String Pool
   * */

    int age = 21;
    Point pointA = new Point(10, 10);
        System.out.println("pointA =" +pointA);
        pointA.move(10, 11);
        System.out.println("pointA =" +pointA);

    }
}
