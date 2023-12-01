package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {


    Map<Integer,Student> map = new HashMap<>();
    Student studentOne = new Student("Tom",25,123);
    map.put(1,studentOne);
        System.out.println(map.get(1).name);

    map.put(2,new Student("Nihad",24,12343));
    for (int each : map.keySet()){
        System.out.println("Each key: " + each);
        System.out.println("Each value: " + map.get(each));
        }
        System.out.println();

        for (int each : map.keySet()){
            if(map.get(each).age == 24){
                System.out.println("time to run Nihad");
            }
            System.out.println();
            for (Student student  : map.values()){
                System.out.println("each value: " );

            }
            System.out.println();

            for ( Map.Entry<Integer,Student> each1  :map.entrySet()){
                System.out.println("Each KEY: " + each1.getKey());
                System.out.println("Each VALUE: " + each1.getValue());
            }
        }
}}
