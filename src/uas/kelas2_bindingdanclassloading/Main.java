package uas.kelas2_bindingdanclassloading;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String path = "uas/kelas2_bindingdanclassloading";

        ArrayList<String> al = new ArrayList<String>();

        do{
            System.out.println("Jumlah peliharaanku: "+ al.size());
            System.out.print("# Panggil kelas Hewan baru: ");
            String next = new Scanner(System.in).next();
            al.add(next);
            if(al.get(al.size()-1).equals("ex")){
                al.remove(al.size()-1);
                System.out.println("#########");
                System.out.println("Jumlah peliharaanku: "+al.size());
                break;
            }
        } while (!al.get(al.size()-1).equals("ex"));

        for(String object : al){
            Binatang binatang = (Binatang)Class.forName(path+"."+object).newInstance();
            binatang.bersuara();
        }
    }
}