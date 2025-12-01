package day44_map_and_functions.map_recap;

/*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class MapSalary {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("Nihad",140_000.00);
        map.put("Ahmed",150_000.00);
        map.put("Tom",100_000.00);
        map.put("Alina",110_000.00);
        double maxSalary =Integer.MIN_VALUE;
        double minSalary = Integer.MAX_VALUE;
        int count =0;
        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String,Double> each :map.entrySet()){
            if (each.getValue() > maxSalary){
                maxSalary = each.getValue();
            }
            if (each.getValue() < minSalary ){
                minSalary = each.getValue();
            }
            if(each.getValue() >= 120_000 && each.getValue() <= 150_000){
                count ++;
            }
            if (each.getValue() < 118_000){
                list.add(each.getKey());
            }
        }
        System.out.println("Max salary: " + maxSalary);
        System.out.println("Min salary: " + minSalary);
        System.out.println("Nums of employees has the salary between 120k ~ 150K: " + count);
        System.out.println("names of the employees who are making less than 118k: " + list);

        System.out.println("After increasing of salary");
        for (Map.Entry<String,Double> each:map.entrySet()){
            map.put(each.getKey(), each.getValue() + 10_000);
        }
        System.out.println(map);


    }
}
