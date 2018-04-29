package latihanUTS;

public class Backpack extends Tas implements IDiskon {
    private int jumlahKantong;
    private String jasTas;
    private static int counterBackpack;

    public Backpack(String warnaDasar, String bahan, int jmlKantong, String jasTas) {
        super(warnaDasar, bahan);
        this.jumlahKantong = jmlKantong;
        this.jasTas = jasTas;
        counterBackpack += 1;
    }

    public double hitungDiskon(){
        //24010313130108
        double A = 13;
        double B = 8;
        return ((50/jumlahKantong)+(A/B))/100;

    }

    @Override
    public double hitungHargaJual() {
        return 500000 - hitungDiskon();
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jumlah Kantong: "+ jumlahKantong +
        "\nJas Tas: "+ jasTas +
        "\nCounter Backpack: "+ counterBackpack);
    }

    public static int getCounterBackpack() {
        return counterBackpack;
    }
}
