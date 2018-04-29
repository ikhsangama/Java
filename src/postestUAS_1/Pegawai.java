//  Nama    : Ikhsan Wisnuadji G
//  NIM     : 24010313130108

package postestUAS_1;
public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: "+ this.nama +",Gaji pokok: "+this.gajiPokok);
    }

}
