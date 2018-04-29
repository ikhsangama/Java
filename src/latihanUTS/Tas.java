package latihanUTS;

public abstract class Tas {
    protected String warnaDasar, bahan;
    protected double hargaJual, division;
    protected static int counterTas;

    public Tas(String warnaDasar, String bahan){
        this.warnaDasar = warnaDasar;
        this.bahan = bahan;
        counterTas += 1;
    }

    public void cetakInfo(){
        System.out.println("Warna dasar: " + warnaDasar+
        "\nBahan: "+ bahan +
        "\nHarga Jual: "+ hargaJual +
        "\nDivision: "+ division +
        "\ncounterTas"+ counterTas);
    }

    public abstract double hitungHargaJual();

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public static void setCounterTas(int counterTas) {
        Tas.counterTas = counterTas;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public String getBahan() {
        return bahan;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public double getDivision() {
        return division;
    }

    public static int getCounterTas() {
        return counterTas;
    }
}
