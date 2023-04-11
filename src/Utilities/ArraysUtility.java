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




}
