package latihanUTS.nasywa.seluler;

public class NaKartu {
    public double saldo = 0;

    public void topUpSaldo(double top) {
        this.saldo = this.saldo + top;
        System.out.println("Top	Up Pulsa Sukses, Saldo Pulsa= " + this.saldo);
    }

    public void tlp(double tlp) {
        this.saldo = this.saldo - tlp;
        System.out.println("Terimakasih	telah melakukan panggilan tlp," +
                "Saldo Pulsa=	" + this.saldo);
    }

    public void sms(double sms) {
        this.saldo = this.saldo - sms;
        System.out.println("Terimakasih telah melakukan sms," +
                "Saldo Pulsa= " + this.saldo);
    }

    public void cekSaldo() {
        System.out.println("Saldo Anda=	" + this.saldo);
    }
}
