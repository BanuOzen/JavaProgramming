package Utilities;

public class MathUtility {

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static boolean isOdd(int num){
        return (num % 2 !=0)? true :false;
    }
    public static boolean isEven(int num){
        return (num % 2 ==0)? true:false;
    }

    public static int max(int num1, int num2){
        return (num1>num2)? num1 : num2;
    }
    public static double max(double num1, double num2){
        return (num1>num2)? num1 : num2;
    }
    public static int min(int num1, int num2){
        return (num1<num2)? num1 : num2;
    }
    public static double min(double num1, double num2){
        return (num1<num2)? num1 : num2;
    }

    public static int square(int edge){
        return edge * edge;
    }
    public static double square(double edge){
        return edge * edge;
    }

    public static int cube(int edge){
        return edge * edge * edge;
    }

    public static double cube(double edge){
        return edge * edge * edge;
    }
}
