package inherit;

public class Admin extends Staff{
    String bagian;

    Admin(String nama, String gelar, String bagian){
        super(nama, gelar);
        this.bagian = bagian;
    }

    public void setGaji(int i){
        gaji = i +1000;
    }

    public void setBonus(int bonus){
        int gaji;
        gaji = getGaji()+bonus;
        setGaji(gaji);
    }
}
