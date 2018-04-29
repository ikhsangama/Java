package prak7.soalLatihan2018responsi;

public class Majalah extends Item {

    private int bulanTerbit;

    @Override
    void setCetakanKe(int cetakanKe) {

    }

    @Override
    public void printInfo() {
        System.out.println("ID: "+ id +", Judul: "+ this + ", Th terbit: "+ tahunTerbit + ", Bulan terbit: "+ bulanTerbit);
    }

    @Override
    public double getHargasewa() {
        return hargaSewa;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewa;
    }

    Majalah(int id, String judul, int tahunTerbit, int hargaSewa, int bulanTerbit){
        super(id, judul, tahunTerbit, hargaSewa);
        this.bulanTerbit = bulanTerbit;
    }
}
