package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100,
                n2=20;

        if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");
        }
        if (n2<n1){
            System.out.println(n2 + " is the minimum number");
        }
        if(n1==n2){
            System.out.println("Equal");
        }
    }
}
