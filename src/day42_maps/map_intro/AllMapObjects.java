package day42_maps.map_intro;

import com.sun.source.tree.Tree;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); // order is random, null KEY is ok
        map.put("feyruz","java");
        map.put("hello","world");
        map.put("tom","Jerry");
        map.put("nadir","softskills");
        map.put("username","password");
        map.put(null,"nothing");
        System.out.println(map);

        Map<String,String> linked = new LinkedHashMap<>(); // insertion order kept, null KEY is okay
        linked.put("feyruz","java");
        linked.put("hello","world");
        linked.put("tom","Jerry");
        linked.put("nadir","softskills");
        linked.put("username","password");
        linked.put(null,"nothing");
        System.out.println(linked);

        Map <String, String> treeMap = new TreeMap<>();  // KEYS is alphabetic order (sorted)
        treeMap.put("feyruz","java");
        treeMap.put("hello","world");
        treeMap.put("tom","Jerry");
        treeMap.put("nadir","softskills");
        treeMap.put("username","password");
        treeMap.put("something",null);
       // treeMap.put(null,"nothing"); // null is not ok for threeMap
        System.out.println(treeMap);

        Map <String,String> hashtable = new Hashtable<>(); // Order is not guaranteed
       hashtable.put("feyruz","java");
       hashtable.put("hello","world");
       hashtable.put("tom","Jerry");
       hashtable.put("nadir","softskills");
       hashtable.put("username","password");
     //  hashtable.put(null,"nothing");    // null is not okay for hashtable as KEY and as VALUE
        System.out.println(hashtable);
    }
}
