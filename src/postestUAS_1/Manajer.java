//Nama  : Ikhsan Wisnuadji G
//NIM   : 24010313130108

package postestUAS_1;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    Manajer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+ tunjangan);
    }
}
