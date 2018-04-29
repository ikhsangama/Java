//Nama  : Ikhsan Wisnuadji G
//NIM   : 24010313130108
package postestUAS_1;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai p1 = new Programmer("Mira");
        Pegawai p2 = new Manajer("Joko");
        Manajer p3 = new Manajer("Argo");
        Pegawai p4 = new Pegawai();
        Pegawai p5 = new Pegawai();

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(p1);
        emps.add(p2);
        emps.add(p3);

        for (Pegawai emp: emps){
            emp.tampilData();
        }

    }
}