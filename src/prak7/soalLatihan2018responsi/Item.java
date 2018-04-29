package prak7.soalLatihan2018responsi;

public abstract class Item implements IRentable, IPrintAble{
    protected int id;
    protected String judul;
    protected int tahunTerbit;
    protected int cetakanKe;
    protected double hargaSewa;
    protected static int counter;

    public Item(int id, String judul, int tahunTerbit, double hargaSewa){
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.hargaSewa = hargaSewa;
        counter = counter+1;
    }

    abstract void setCetakanKe(int cetakanKe);

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public String toString() {
        return judul;
    }
}
