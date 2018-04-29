package prak1_ObjectOrientation;

public class MTitik {

    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        t1.setAbsis(1.0);
        t1.setOrdinat(2.0);
        t2.setAbsis(3.0);
        t2.setOrdinat(4.0);

        /*POST TEST*/
        Titik t3;
        t3 = new Titik(5,6);

        System.out.println("Jumlah objek titik: "+ Titik.getCounterTitik());
        System.out.println("t1("+ t1+")");
        System.out.println("t2("+ t2+")");
        System.out.println("t3("+ t3+")");
    }
}
