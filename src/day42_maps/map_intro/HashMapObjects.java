package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {

        Map <Integer, Integer > map = new HashMap<>();
        map.put(1,1);
        map.put(2,400);
        System.out.println(map);
        System.out.println();
        Map <Integer, String> map2 = new HashMap<>();
        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(3,"three");
        map2.put(4,"four");
        map2.put(-2, "two");
        map2.put(10,"ten");
        map2.put(11,"eleven") ;
        System.out.println(map2);
        System.out.println(map2.get(1));
        map2.remove(1);
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsValue("ten"));
        String str = map2.remove(4);
        System.out.println(str);
        map2.put(2,"three");
        System.out.println(map2);


    }
}
