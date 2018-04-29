package latihanUTS.nasywa.seluler;

public class MNaSel {
    public static void main(String[] args) {
        NaKartu	C0811	=	new	NaKartu();
        C0811.topUpSaldo(100000);
        C0811.tlp(10000);
        C0811.sms(1000);
        C0811.cekSaldo();
        System.out.println("");
        NaData	S0822	=	new	NaData("0822");
        S0822.topUpSaldo(50000);
        S0822.topUpSaldoData(2);
        S0822.beliData(3);
        S0822.useData(1,"21	April");
        S0822.useData(1,"22	April");
        S0822.useData(1,"22	April");
    }
}
