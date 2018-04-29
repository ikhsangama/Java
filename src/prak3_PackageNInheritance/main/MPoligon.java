package prak3_PackageNInheritance.main;

import prak3_PackageNInheritance.bangundatar.PersegiPanjang;

public class MPoligon {
    public static void main (String[] args) {
        PersegiPanjang p = new PersegiPanjang(10,10,4);
        p.printInfo();
        System.out.println("Luas persegi panjang "+ p.hitungLuas());
    }
}
