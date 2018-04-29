package kampus;

public class Kuliah {
    private String kodeKuliah, namaKuliah;
    private int sks;
    private Dosen pengampu1, pengampu2;
    private static int jmlKuliah;

    public Kuliah(String kodeKuliah, String namaKuliah, int sks, Dosen pengampu1, Dosen pengampu2) {
        this.kodeKuliah = kodeKuliah;
        this.namaKuliah = namaKuliah;
        this.sks = sks;
        this.pengampu1 = pengampu1;
        this.pengampu2 = pengampu2;
        setJumlahKuliah();
    }

    private void setJumlahKuliah() {
        jmlKuliah = jmlKuliah + 1;
    }

    public void info() {
        System.out.println(
                "Kode kuliah: " + kodeKuliah +
                        "\nNama Kuliah: " + namaKuliah +
                        "\nSKS: " + sks +
                        "\nPengampu1: " + pengampu1 +
                        "\nPengampu2: " + pengampu2);
    }

    public String getNamaKuliah() {
        return namaKuliah;
    }
}
