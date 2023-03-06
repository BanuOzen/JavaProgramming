package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assigment:=
        int number=100;
        System.out.println("number = " + number);

        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word="Cydeo";
        System.out.println("word = " + word);

        word ="123"+1;


        word = "Java Programming";
        System.out.println("word = " + word);

        // Addition Assigment:
        int x = 100;

        System.out.println("x = " + x);
        System.out.println(x +200);

        System.out.println("x = " + x);

        String str = "Wooden";
        str+="Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 +=5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.0;

        // deposit

        availableBalance += 300; // availableBalance =1000.50 + 300

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("-------------------------------------");

        //with drawing 500$

        availableBalance += 500;

        System.out.println("availableBalance = " + availableBalance);


        // with drawing 200$, then depositing 400$

        availableBalance -=200; //available balance = 600.5
        availableBalance +=400; //available balance = 1000.5

        System.out.println("availableBalance = " + availableBalance);


        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *=2;
        System.out.println("salary = " + salary);

        double doge = 0.0000001;
        doge *=1000000;
        System.out.println("doge = " + doge);

        System.out.println("----------------------------");

        double num2 = 25000;

        //num2 = num2 /2;

        num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("----------------------------");
        
        double num3 = 100;
        
        //  %= remainder
        
        num3 %=3;
        System.out.println("num3 = " + num3);

        System.out.println("----------------------");
        
        int amount =127; //cents
        
        int quarters = 127 / 25;
        
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);


        System.out.println("--------------------");

        int balance = 3500;

        // insurance fee:$153
        balance %=153;

        System.out.println("balance = " + balance);




        















    }
}
