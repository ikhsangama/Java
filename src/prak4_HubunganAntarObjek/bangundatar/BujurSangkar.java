package prak4_HubunganAntarObjek.bangundatar;

import prak4_HubunganAntarObjek.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi*panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }
}
