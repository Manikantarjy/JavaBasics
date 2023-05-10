package com.ManiTheTester.MethodsPractise;

public class Methods {


        /*
        * Methods: A method is a block of code only runs when invoked
        we can use methods to reuse code that can be shared across the entire app.
        if something that we do over and over again, then we can create a reusable method.

        * Below is the structure
        - Access Modifier
        - Optional Static
        - Return type
        - Name
        - Optional Parameters
        - Method Body
        - Optional return value
        * */

       /* The below method with Static : It will

       private static int add(int n1, int n2){
            int result = n1 + n2;
            return result;
        }
        */

    //Without static
        private int add(int n1, int n2){
            int result = n1+n2;
            return result;
        }

        public static void main(String[] args) {
        //Calling method using static
//            int result = add(10 , 20);
//            //reuse
//            int result2 = add(120, 100);
//            System.out.println(result);
//            System.out.println(result2);

            //Calling method without static: we need to create object of it
            Methods main = new Methods();
            int result = main.add(10, 20);
            int result2 = main.add(10, 100);
            System.out.println(result);
            System.out.println(result2);

        }



}
