package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345Sccn  nckdmk7584^^+^^+%";

        String digits="";
        String letters="";
        String specialCharacters="";
        for (int i = 0; i < str.length(); i++) {//i: index numbers of str (0~last index)

            char ch=str.charAt(i);//ch:each character that we have in str

            if(ch>='0' && ch<='9'){ //if the character is between '0' to '9' then its digit
                digits+=ch;
            }else if(ch>='A' && ch<='Z'){//if the character is between 'A' to 'Z' then its letter
                letters+=ch;
            }else if(ch>='a' && ch<='z'){//if the character is between 'A' to 'Z' then its letter
                letters+=ch;
            }else{//if the character is neither digit nor letter, then its special character
                if(ch!=' '){
                    specialCharacters+=ch;
                }

            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);



    }
}
