package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;
        /*
        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("-----------------------");

         */

        String result = (n%2 == 0)? "Even" : "Odd" ;
        System.out.println(result);
        


    }
}
