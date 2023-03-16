package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter her score: ");
        int score= scan.nextInt();

        if(score>=0 && score<=100){

            if(score>=90){
                System.out.println("A");
            }else if(score>=70 && score<=89 ){
                System.out.println("B");
            }else if(score>=60 && score<=69){
                System.out.println("C");
            }else if(score>=50 && score<=59){
                System.out.println("D");
            }else{
                System.out.println("F");
            }

        }else{
            System.out.println("Invalid value");
        }

        scan.close();


    }
}
/*
    2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */