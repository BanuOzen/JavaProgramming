package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        // 1000$
        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar * 0.86;
        // jpy, pound, peso, cad, riyal, rub ...
        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.24;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);




    }
}
