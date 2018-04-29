/*POST TEST*/

package prak4_HubunganAntarObjek.main;

import prak4_HubunganAntarObjek.bangunruang.Kubus;
import prak4_HubunganAntarObjek.bangundatar.BujurSangkar;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(4);
        Kubus k = new Kubus();
        k.setPermukaan(bs);
        System.out.println("Luas: "+ k.hitungLuasAlas());
        System.out.println("Volume: "+ k.hitungVolume());
    }
}
