package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecialChar++;
            }

        }
/*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigit = " + countDigit);

 */


        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countLowerCase >0;
        boolean hasDigit = countDigit >0;
        boolean hasSpecialCharacter = countSpecialChar >0;


       // boolean strongPassword = password.length() >=8 && !password.contains(" ")
            //  && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;

        boolean strongPassword = false;
        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowerCase){
                        if(hasDigit){
                            if(hasSpecialCharacter){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }

        }

        System.out.println("strongPassword = " + strongPassword);






    }
}
