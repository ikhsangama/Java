package prak2_Enkapsulasi;

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4,4);
        System.out.println("Titik:(" + t.getAbsis() +", "+ t.getOrdinat()+")");
        OperasiTitik op1 = new OperasiTitik();
        op1.RefleksiSumbuX(t);
        op1.RefleksiSumbuY(t);

        System.out.println("Refleksi X: "+ op1.RefleksiX(t));
        System.out.println("Refleksi T: "+ op1.RefleksiY(t));
        System.out.println(Titik.getCounterTitik());
    }

    /* Baik method maupun atribut / variable, memiliki kesamaan sifat tingkat akses, yaitu:
    Private     : Hanya dapat diakses dalam satu kelas
    Protected   : Dapat diakses beda kelas, namun masih satu package
    Public      : Dapat diakses dimanapun meski beda package
    */
}
