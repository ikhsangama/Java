//Nama  : Ikhsan Wisnuadji G
//NIM   : 24010313130108

package postestUAS_1;

public class Programmer extends Pegawai {
    private int tunjangan = 450000;

    Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+ tunjangan);
    }
}
