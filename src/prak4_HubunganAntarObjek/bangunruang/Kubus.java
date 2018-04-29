package prak4_HubunganAntarObjek.bangunruang;

import prak4_HubunganAntarObjek.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public double hitungVolume(){
        double volume = this.permukaan.hitungLuas() * this.permukaan.getPanjangSisi();
        return volume;
    }

    public double hitungLuasAlas(){
        double LuasAlas = Math.pow(this.permukaan.getPanjangSisi(),2);
        return LuasAlas;
    }

    public void setPermukaan(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public BujurSangkar getPermukaan() {
        return permukaan;
    }
}
