package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "         batch      25       ";
        str1=str1.trim(); //"batch25"

        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);//8

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);//9

        String str3 = "Java Programming Languages";

        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);


        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);





    }
}
