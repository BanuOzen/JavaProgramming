package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a =100;
        short b = a;

        // short b = (short)a;
        //         = (short)a
        int c = b; // implicit casting
        // int c =(int)b

        long d = c;
        //     =(long)c

        float e = d;
        double f =e;

        System.out.println("--------------------");
        int x = 55;
        short y = (short)x;
        System.out.println(x + ":" + y);


        long j = 1000000;
        short k =(short)j;

        System.out.println(j + ":" + k);


        double l = 2.5;
        float m = (float)l;
        System.out.println(l + ":" +m);

        double n = 10.8;
        int s = (int)n;   //int=10

        System.out.println(n + ":" +s);

        double d1 = 20.5;
        short s1 =(short) d1;

        System.out.println(d1 + ":" + s1);











    }
}
