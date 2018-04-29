package prak7.soalLatihan2018responsi;

public class Buku extends Item {

    private String pengarang;

    @Override
    void setCetakanKe(int cetakanKe) {

    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + id + ", Judul: " + this + ", Th terbit: " + tahunTerbit + ", Pengarang: " + pengarang);
    }

    @Override
    public double getHargasewa() {
        return hargaSewa;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return lamaSewa * hargaSewa;
    }

    public Buku(int id, String judul, int tahunTerbit, double hargaSewa, String pengarang) {
        super(id, judul, tahunTerbit, hargaSewa);
        this.pengarang = pengarang;
    }
}
