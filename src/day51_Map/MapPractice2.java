package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John",123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        // 1.1 who has the maximum salary?

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }
            if(eachValue < minSalary){
                minSalary = eachValue;
                name2 = eachKey;
            }


        }
        System.out.println(name1);
        System.out.println(name2);

        System.out.println("===============================");

        // how many employees has the salary between 120k-150k?

        int count = 0;
        for (Integer eachValue : map.values()) {
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("=============================");

        // 1.4 display the names of the employees who are making less than 118K?

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if( pair.getValue() < 118000){
                System.out.println(pair);
            }
        }
        System.out.println(map);

        // increase the salalry of each employee by 10K if the correct salary of employee is less than 120K
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < 120000){
                entry.setValue(entry.getValue()+10000);
            }
        }

        System.out.println(map);










    }
}
