package latihanUTS;

public class SlingBag extends Tas implements IDiskon{
    private int jumlahTali;
    private String aksesoris;
    private static int counterSlingBag;

    public SlingBag(String warna, String bahan, int jmlTali, String aksesoris){
        super(warna, bahan);
        this.jumlahTali = jmlTali;
        this.aksesoris = aksesoris;
    }

    @Override
    public double hitungDiskon() {
        double A = 14;
        double B = 8;
        return ((50-jumlahTali)+(B/A))/100;
    }

    @Override
    public double hitungHargaJual() {
        return 500000-hitungDiskon();
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jumlah Kantong: "+ jumlahTali +
                "\nJas Aksesoris: "+ aksesoris +
                "\nCounter Sling Bag: "+ counterSlingBag);
    }

}
