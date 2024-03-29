package day25_CustomMethod_Overloading;


import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("========================");

        String s1 = "Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("=========================");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("============================");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("=============================");

        String s2 = "aaaaabbbbbcccddddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);



    }

}
