package prak2_Enkapsulasi;

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik;

    public Titik(){
        setCounterTitik();
    }

    public Titik(double a, double b){
        absis = a;
        ordinat = b;
        setCounterTitik();
    }

    private void setCounterTitik() {
        counterTitik = counterTitik+1;
    }

    public double setAbsis(double a){
        absis = a;
        return absis;
    }

    public double setOrdinat(double o){
        ordinat = o;
        return o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }
}