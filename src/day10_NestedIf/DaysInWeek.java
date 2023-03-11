package day10_NestedIf;

public class DaysInWeek {
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

        System.out.println("---------------------------------");

        String result2 =(n==1) ? "Monday" :(n==2)? "Tuesday" : (n==3)? "Wednesday" :(n==4)? "Thursday" :
                (n==5)? "Friday" : (n==6)? "Saturday" : "Sunday";

        System.out.println(result2);





    }
}
