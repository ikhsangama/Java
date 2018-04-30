package uas.kelas4_collection.wordfrek;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String kalimat = "This is a test. Yes it is a test of a test.";
        WordFrek wf = new WordFrek(kalimat);
        Map<String, Integer> kataUnik = wf.findUnikue();

        /*Tampilkan jumlah kata unik*/
        System.out.println(kataUnik.size());

        /*Tampilkan map kata unik dan frekuensinya*/
        /*cara 1*/
        System.out.println();
        System.out.println("Cara 1");
        System.out.println(kataUnik);
        /*cara 2*/
        System.out.println();
        System.out.println("Cara 2");
        Set<String> set = kataUnik.keySet();
        for(String i: set){
            System.out.println(i + " => "+ kataUnik.get(i));
        }

    }
}
