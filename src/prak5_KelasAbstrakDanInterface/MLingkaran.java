/*POST TEST*/

package prak5_KelasAbstrakDanInterface;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan jejari: ");
        double jejari = scanner.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari "+ jejari +" satuan adalah "+ l.hitungLuas());
    }
}
