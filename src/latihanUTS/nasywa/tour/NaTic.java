package latihanUTS.nasywa.tour;

public class NaTic {
    String dari, ke, tgl, kelas;
    int jumPenumpang, biaya;
    String status;

    void bayarTiket(int b) {
        if (this.biaya < b) {
            this.status = "Lunas";
            System.out.println("Pembayaran	Tiket	Anda	Berlebih, Terimakasih.Status = " + this.status);
        } else if (this.biaya > b) {
            System.out.println("Maaf,	Pembayaran	Anda	Kurang.	Status	= " + this.status);
        } else {
            this.status = "Lunas";
            System.out.println("Terimakasih	telah	melakukan	pembayaran Lunas.Status = " + this.status);
        }
    }

    NaTic(String dari, String ke, String tgl, String kelas, int jumPenumpang, int biaya) {
        this.dari = dari;
        this.ke = ke;
        this.tgl = tgl;
        this.kelas = kelas;
        this.jumPenumpang = jumPenumpang;
        this.biaya = biaya;
        this.status = "belum Lunas";
        System.out.println("Terimakasih	telah melakukan	pemesanan Tiket	:");
        System.out.println("Dari:	" + this.dari + "	ke	:	" + this.ke);
        System.out.println("Tanggal:	" + this.tgl + "	kelas	:	" + this.kelas + "Jumlah Penumpang	:" + this.jumPenumpang);
        System.out.println("Total Biaya	:	" + this.biaya);
        System.out.println("Status :	" + this.status);
        System.out.println("");
    }
}
