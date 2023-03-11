package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 85;
        String result="";

        if(s >= 0 && s<=100){ // if the s is valid
            String result1 =  (s >= 0 && s<=100) ? (s>=90)? "Excellent" :(s>=80)? "Great":
                    (s>=70)? "Good" :(s>=60)? "Passed": "Failed": "Invalid Score";

        }else{ // if the s is not valid
            result="Invalid score";
        }
        System.out.println(result);



        System.out.println("------------------------------");

        // solution2: use ternaries ONLY

        /*

        String result2 = (s >= 0 && s<=100) ? (s>=90)? "Excellent" :(s>=80)? "Great":
                (s>=70)? "Good" :(s>=60)? "Passed": "Failed": "Invalid Score";

        System.out.println(result2);

         */







    }
}
