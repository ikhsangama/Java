package uas.kelas4_collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Clct_1List {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("AA");
        al.add("BB");
        al.add("CC");

        System.out.println(al.size());
        System.out.println(al);

        System.out.println();
        System.out.println("Iterasi 1");
        /*ITERASI 1*/
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println();
        System.out.println("Iterasi 2");
        /*ITERASI 2*/
        Iterator i = al.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println("Iterasi 3");
        /*ITERASI 3*/
        for(String item: al){
            System.out.println(item);
        }
    }
}
