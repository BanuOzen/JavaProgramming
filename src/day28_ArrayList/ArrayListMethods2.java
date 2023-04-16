package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
/*
        int num = 1;
        list.remove(num);

 */
        Integer num = 200;
        //list.remove(200);

        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("=====================");

        list.clear();

        System.out.println(list.size());
        System.out.println(list);









    }
}
