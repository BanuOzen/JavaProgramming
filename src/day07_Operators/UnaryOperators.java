package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1<0);
        System.out.println(num2<0);

        int a = 5;
        //pre increment: increases the value by 1 right away
        ++a;
        //6
        System.out.println(a);
        --a;
        //pre decrement: decreases the value by 1 right away
        System.out.println(a);




        int b =100;
        System.out.println(++b); // pre increment: increases the value by 1 right away

        int c = 100;
        System.out.println(c++);// post increment: first passes the currant value, then increases the value by 1
        System.out.println(c); // 101
        System.out.println("-----------------------------------");

        int x = 200;

        System.out.println(--x); //
        int y =200;

        System.out.println(y--);// post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y); // 199

        int z = 45;
        System.out.println(++z);//z=46
        System.out.println(z++);//z=46
        System.out.println(z);//z=47
        System.out.println(--z);//z=46
        System.out.println(z--);// z=46
        System.out.println(z);//45

        int q = 30;
        System.out.println(--q);//29,
        System.out.println(q--);//29
        System.out.println(q);//28





    }
}
