package prak7.soalLatihan2018responsi;

import java.util.ArrayList;

public class MItem {

    public static void main(String[] args) {
        Item buku = new Buku(1, "PBO", 2018, 500, "Rizqi");
        Item majalah = new Majalah(1, "Jmasif", 2018, 5000, 4);
        Item icicos = new Proceeding(1, "ICICoS", 2017, 50, 1);
        Item soa = new Proceeding(2, "SOA", 2015, 50);

        ArrayList<Item> koleksiPerpus = new ArrayList<>();
        koleksiPerpus.add(buku);
        koleksiPerpus.add(majalah);
        koleksiPerpus.add(icicos);
        koleksiPerpus.add(soa);

        // set cetakan prosiding
        icicos.setCetakanKe(3);
        soa.setCetakanKe(9);

        // hitung jumlah item
        System.out.println("Jumlah Item: " + Majalah.counter);

        // mencetak informasi item
        System.out.println("");
        for (Item item : koleksiPerpus) {
            item.printInfo();
        }

        // Penghitungan biaya pinjam
        System.out.println("");
        System.out.println("Harga Sewa Awal");
        System.out.println("Biaya pinjam 7 hari:");
        for (Item item : koleksiPerpus) {
            System.out.println(item.getClass().getSimpleName()
                    + " " + item.toString() + " : " + item.hitungBiayaSewa(7));
        }

        // Penghitungan biaya pinjam naik 10%
        for (Item item : koleksiPerpus) {
            item.setHargaSewa(item.getHargaSewa() * 0.1 + item.getHargaSewa());
        }
        System.out.println("");
        System.out.println("Harga Sewa Setelah Naik 10%");
        System.out.println("Biaya pinjam 7 hari:");
        for (Item item : koleksiPerpus) {
            System.out.println(item.getClass().getSimpleName()
                    + " " + item.toString() + " : " + item.hitungBiayaSewa(7));
        }
        System.out.println("");
    }
}