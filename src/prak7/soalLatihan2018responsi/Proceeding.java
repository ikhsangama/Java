package prak7.soalLatihan2018responsi;

public class Proceeding extends Item {

    private int cetakanKe;

    @Override
    void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    @Override
    public void printInfo() {
        System.out.println("ID: "+ id +", Judul: "+ this + ", Th terbit: "+ tahunTerbit + ", Cetakan ke: "+ cetakanKe);
    }

    @Override
    public double getHargasewa() {
        return hargaSewa;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return lamaSewa * hargaSewa *(1+(tahunTerbit%2000));
    }


    public Proceeding(int id, String judul, int tahunTerbit, double hargaSewa){
        super(id, judul, tahunTerbit, hargaSewa);
    }

    public Proceeding(int id, String judul, int tahunTerbit, double hargaSewa, int cetakanKe){
        super(id, judul, tahunTerbit, hargaSewa);
        this.cetakanKe = cetakanKe;
    }
}
