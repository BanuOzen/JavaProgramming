package day13_String;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age= scan.nextInt();

        System.out.println("enter your gender: ");
        String gender=scan.next();

        scan.nextLine();
        System.out.println("Enter your full name: " );
        String fullName=scan.nextLine();


    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)---->nextInt
			2. Enter your gender (String- One word ONLY)---->next
			3. Enter your full name (String- Multiple words)-->nextLine
			4. Enter your phone number (long)----->nextLong
			5. Enter your zip code (int)------>nextInt
			6. Enter your School name (String- Can be Multiple words)-->nextLine
			7. Enter your city name (String- Can be Multiple words)---->nextLine
			8. Enter your state name (String- One word ONLY)------>next
			9. Enter your building number (int)------>nextInt
			10. Enter your Street name----->nextLine

 */