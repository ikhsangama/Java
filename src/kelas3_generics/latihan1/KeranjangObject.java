package kelas3_generics.latihan1;

public class KeranjangObject {
    Object buah;
    KeranjangObject(Object namaBuah){
        this.buah = namaBuah;
    }

    public Object getBuah() {
        return buah;
    }

    public void setBuah(Object buah) {
        this.buah = buah;
    }
}
