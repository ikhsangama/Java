package ewallet;

//import static java.lang.Math.*;

public class Ewallet {
    double saldo;
    int poin;

    void topUp(int saldo){
        this.saldo = this.saldo + saldo;
    }

    void transaksi(double bayar){
        if(bayar>= saldo){
            System.out.println("saldo tidak mencukupi");
        }
        else{
            saldo = saldo - bayar;
        }
    }

    void transaksi(String bonus,double bayar){
        if(bayar>= saldo){
            System.out.println("saldo tidak mencukupi");
        }
        else{
            saldo = saldo - bayar;
            poin = (int) ((this.poin + Math.floor(bayar/100000))*10);
        }
    }
}
