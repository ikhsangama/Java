package uas.kelas4_collection;

import java.util.Set;
import java.util.HashSet;

public class Clct_2Set {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("AA");
        hs.add("BB");
        hs.add("AA");

        System.out.println(hs.size());
        System.out.println(hs);
    }

}
