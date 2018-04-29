package prak2_Enkapsulasi;

public class OperasiTitik {

    public void RefleksiSumbuX(Titik t){
        double y;
        y = (-1) * t.getOrdinat();
        t.setOrdinat(y);
        System.out.println("titik setelah refleksi sb X: titik("+ t.getAbsis() + ", " + t.getOrdinat() +")");
    }


    public void RefleksiSumbuY(Titik t){
        double x;
        x = (-1) * t.getAbsis();
        t.setAbsis(x);
        System.out.println("titik setelah refleksi sb Y: titik("+ t.getAbsis() + "," + t.getOrdinat() +")");
    }

    public double RefleksiX(Titik t){
        double y;
        y = (-1) * t.getOrdinat();
        return y;
    }

    public double RefleksiY(Titik t){
        double x;
        x = (-1) * t.getAbsis();
        return x;
    }
}
