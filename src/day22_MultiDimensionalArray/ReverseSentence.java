package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String reverseSentence = "";// Java learn to day good a is today

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] +" ";
        }
        System.out.println(reverseSentence);

    }
}

/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */