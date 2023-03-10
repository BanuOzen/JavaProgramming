package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 5;
        String result ="";

        if(n==1){
            result="Monday";
        }else if(n==2){
            result="Tuesday";
        }else if(n==3){
            result="Wednesday";
        }else if(n==4){
            result="Thursday";
        }else if(n==5){
            result="Friday";
        }else if(n==6){
            result="Saturday";
        }else if(n==7){
            result="Sunday";
        }else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
