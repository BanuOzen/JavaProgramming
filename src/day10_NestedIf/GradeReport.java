package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        if(score >= 0 && score<=100){ // if the score is valid

            if(score>=90){
                System.out.println("Excellent");
            }else if(score>=80){
                System.out.println("Great");
            }else if(score>=70){
                System.out.println("Good");
            }else if(score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else{ // if the score is not valid
            System.out.println("Invalid Score");
        }

    }
}
