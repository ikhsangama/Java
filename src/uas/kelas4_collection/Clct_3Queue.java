package uas.kelas4_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Clct_3Queue {
    public static void main(String[] args) {
        Queue<String> ll = new LinkedList<>();
        ll.add("AA");
        ll.add("BB");
        ll.add("CC");

        System.out.println(ll);
        System.out.println(ll.peek());

        System.out.println();
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll.poll());
        System.out.println(ll);
    }
}
