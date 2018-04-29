package sepeda;

public class Sepeda {
    String merk;
    double harga;

    Sepeda(String m, double h){
        this.merk = m;
        this.harga = h;
    }

    boolean sama(Sepeda l){
        return this.merk.equals(l.merk) && this.harga==l.harga;
    }
}
