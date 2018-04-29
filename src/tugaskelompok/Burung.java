package tugaskelompok;

public class Burung extends Hewan {
//    String makan;
    @Override
    String makanan() {
        this.makan = "ulat";
        return null;
    }
/*asd
        * asd*/
    public String makanHewan() {
        return super.makanan();
    }
}
