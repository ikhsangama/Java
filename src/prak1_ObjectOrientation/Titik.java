package prak1_ObjectOrientation;

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        counterTitik++;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    /*POST TEST*/
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    @Override
    public String toString() {
        return this.getAbsis() +", " +this.getOrdinat();
    }
}
