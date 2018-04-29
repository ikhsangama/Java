package ewallet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ewallet e = new Ewallet();
        System.out.println("Masukkan top up awal: ");
        int saldo = sc.nextInt();
        e.topUp(saldo);

        int bayar;
        System.out.println("Masukkan nominal yang harus dibayar: ");
        bayar = sc.nextInt();

        if(bayar>=100000){
            e.transaksi("",bayar);
        }
        else {
            e.transaksi(bayar);
        }

        System.out.println("saldo: "+ e.saldo);
        System.out.println("poin: "+ e.poin);
    }
}
