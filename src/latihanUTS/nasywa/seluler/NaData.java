package latihanUTS.nasywa.seluler;

public class NaData extends NaKartu {
    private double saldoData, jumData, bonusData;
    private String day;

    public NaData(String n) {
        this.saldoData = 0;
        this.jumData = 0;
        this.bonusData = 0;
        this.day = "21	April";
        System.out.println("Selamat	Datang	Pelanggan	NaData,	Nomor Katu	=	" + n + "	,	Kartu	Anda	Telah	Diaktifkan	- Terimakasih");
    }

    public void topUpSaldoData(double sd) {
        this.saldoData = this.saldoData + sd;
        System.out.println("Top	Up	Data	Sukses,	Saldo	Data	= " + this.saldoData + ",	Saldo	Pulsa	=	" + this.saldo + ",	Bonus	Data	= " + this.bonusData);
    }

    public void beliData(double gb) {
        double harga1 = 10000;
        if (harga1 * gb <= this.saldo) {
            this.saldoData = this.saldoData + gb;
            this.saldo = this.saldo - (harga1 * gb);
            System.out.println("Pembelian	Data	Sukses,	Saldo	Data	= " + this.saldoData +
                    ",	Saldo	Pulsa	=	" + this.saldo + ",	Bonus	Data	=" + this.bonusData);
        } else {
            System.out.println("Saldo Anda Tidak Mencukupi Pembelian	Data");
        }
    }

    public void useData(double ud, String d) {
        if (this.saldoData >= ud) {
            this.saldoData = this.saldoData - ud;
            if (this.day.equals(d)) {
                this.jumData = this.jumData + ud;
            } else {
                this.day = d;
                this.jumData = ud;
            }
            if (this.jumData >= 2) {
                this.bonusData = this.bonusData + 1;
                this.jumData = 0;
            }
            System.out.println("Terimakasih	telah	menggunakan	Paket Data,	Saldo	Data	=	" + this.saldoData +
                    ",	Saldo	Pulsa	=	" + this.saldo +
                    ",	Bonus	Data =	" + this.bonusData);
        } else {
            System.out.println("Saldo	Data	Anda	Kurang");
        }
    }
}

