package uas.kelas3_generics.latihan1;

public class KeranjangGeneric <T> {
    T buah;

    public KeranjangGeneric(T namaBuah){
        this.buah = namaBuah;
    }

    public void setBuah(T namaBuah) {
        this.buah = namaBuah;
    }

    public T getBuah() {
        return buah;
    }
}
