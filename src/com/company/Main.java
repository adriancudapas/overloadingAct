package com.company;

public class Main {
    /**
     * This method takes in two int parameters to add.
     *
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     *
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     *
     * method that returns the greater integer value
     */

    private static int greaterValue(int a, int b){
       if(a > b){
           return a;
       }else{
           return b;
       }
    }

    /**
     *
     * method that returns the greater double value
     */

    private static double greaterValue(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * calls the methods that take in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The Sum of 1 and 2 is " + computeSum(1, 2));
        System.out.println("The Sum of 1, 2, and 3 is " + computeSum(1, 2, 3));
        /**
         * Call the method greaterValue() with integer parameters
         */
        System.out.println("The greater value between 150 and 100 is " + greaterValue(150,100));

        /**
         * Call the method greaterValue() with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
