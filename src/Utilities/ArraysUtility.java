package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){

        for (int each: array) {
            System.out.println(each);
        }

    }

    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array){

        for (double each: array) {
            System.out.println(each);
        }

    }

    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array){

        for (char each: array) {
            System.out.println(each);
        }

    }


    //prints each String of a String array in separate lines
    public static void printEachElement(String[] array){

        for (String each: array) {
            System.out.println(each);
        }

    }


    
    
    //returns the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the maximum number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the min number for integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the min number for double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){
        //                               {1,2,3,4}            6
        boolean result = false;

        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array.
    // returns boolean. contains(double[], double)
    public static boolean contains(double[] array, double element){
        //                                  {}               6
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }





}
