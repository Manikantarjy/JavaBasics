package com.ManiTheTester.Miscellaneous;

public class Operators {
    public static void main(String[] args) {

//increment and decrement operators
      /*      int number = 0;
            int increment = number +1;
            int decrement = number -1;
            System.out.println(increment);
            System.out.println(decrement);*/

/*increment operator: Post increment : increment++: first assigns the value and increase it by 1
    Pre increment : ++increment : first increments the value and prints it
  *
  */
        int number = 0;
        System.out.println(number++);
        System.out.println(number);

        int number2 = 0;
        System.out.println(++number2);
        System.out.println(number2);


        /*Decrement operator: Post decrement: it assigns the value and decreases it by 1
        * Pre decrement: it decreases the value first and assigns the same
        * */

        int number3= 0;
        System.out.println(number3--);
        System.out.println(number3);

        int number4 =0;
        System.out.println(--number4);
        System.out.println(number4);


    }
}
