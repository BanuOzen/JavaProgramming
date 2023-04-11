package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        ArraysUtility.printEachElement(arr1);


        System.out.println("=======================");


        double[] arr2 = {1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);


        System.out.println("=========================");


        char[] arr3 = {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);


        System.out.println("=========================");


        String[] names = {"David", "Elvira", "Ali", "Igor"};
        ArraysUtility.printEachElement(names);



    }

}
