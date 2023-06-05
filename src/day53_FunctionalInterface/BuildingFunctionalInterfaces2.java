package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuildingFunctionalInterfaces2 {

    public static void main(String[] args) {

        //Create a function that can check if the Integer in an array of integer, return boolean

        BiPredicate<Integer[], Integer> contains = (a,b) -> {
           boolean result = false;
            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }

           return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("==============================================");

        // Create a function that can check if two strings are anagram

        //                                 a=bac, b=cab
        BiPredicate<String, String> anagram = (a,b) -> {
            String[] arr1 = a.split(""); // [b,c,a]
            String[] arr2 = a.split("");  // [c,b,a]
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };

        System.out.println("============================================");

        // Create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s,n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 5);






    }

}
