package inherit;

public class Staff {
    private String nama;
    private String gelar;
    int gaji;

    Staff(String nama, String gelar){
        this.nama = nama;
        this.gelar = gelar;
        gaji = 0;
    }

    void setGaji(int i){
        gaji = i;
    }

    public int getGaji(){
        return gaji;
    }
}
