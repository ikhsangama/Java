package uas.kelas4_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Clct_4Map {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1,"AA");
        hm.put(2, "BB");
        hm.put(3, "CC");

        System.out.println(hm);
        System.out.println(hm.get(1));

        System.out.println();
        System.out.println("Iterasi Map");
        /*Iterasi Map*/
        Set<Integer> set = hm.keySet();
        for(Integer item: set){
            System.out.println(item);
            System.out.println(hm.get(item));
        }
    }
}
