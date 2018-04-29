package kampus;

import java.util.Scanner;

public class MKRS {
    public static void main(String[] args) {
        Mahasiswa faisal = new Mahasiswa("24010","faisal","tembalang325", "0899..");
        Dosen satriyo = new Dosen("19", "satriyo","tembalang99","081...");
        Dosen panji = new Dosen("19", "panji","tembalang98","081...");
        Kuliah pbo = new Kuliah("PAC321","PBO",4,satriyo,panji);
        Kuliah rpl = new Kuliah("PAC322","RPL",4,satriyo,panji);
        Kuliah mtpl = new Kuliah("PAC323","MTPL",3,satriyo,panji);
        Kuliah cc = new Kuliah("PAC324","cc",3,satriyo,panji);
        KRS krs123 = new KRS(faisal,pbo,rpl,mtpl,4,"A");
        faisal.info();
        System.out.println();
        satriyo.info();
        System.out.println();
        pbo.info();
        System.out.println();
        krs123.info();
        System.out.println();
        krs123.gantiKul(pbo,rpl,cc);
        krs123.info();
    }
}
