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

    
    //checks if the given integer is contained in the given array. 
    // returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){
        //                               {1,2,3,4}            6
        boolean result = false;

        for (int each : array) {
            if(each == element){ // if any arrays element is matching with the given element, it means the given elements is
                result = true;
            }
        }
        return result;
    }

    
    //checks if the given double is contained in the given array.
    // returns boolean. contains(double[], double)
    public static boolean contains(double[] array, double element){
        //
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }


    //checks if the given char is contained in the given array.
    // returns boolean. contains(char[], char)
    public static boolean contains(char[] array, char element){
        //
        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }


    //checks if the given String is contained in the given array.
    // returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element){
        //
        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }


    //add the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];

        int i = 0;
        for (int each : array) {
            result[i++]=each;

        }
        result[i]= element;

        return result;

    }


    //add the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        //result[i]=element;// element need to be assigned to the last index
        result[result.length-1]=element;
        return result;

    }

    //add the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;

    }

    //add the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;

    }
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;

    }
    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for (int each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1){
                // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};
        for (double each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1){
                // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {};
        for (char each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1){
                // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {};
        for (String each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1){
                // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
