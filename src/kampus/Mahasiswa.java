package kampus;

public class Mahasiswa extends Manusia {
    private String nim;
    private static int jmlMhs;

    public Mahasiswa(String nim, String nama, String alamat, String noTlp) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.noTlp = noTlp;
        setJmlMhs();
    }

    @Override
    public void info() {
        System.out.println(
                "NIM: " + nim +
                        "\nNama: " + nama +
                        "\nalamat: " + alamat +
                        "\nnoTlp: " + noTlp
        );
    }

    private static void setJmlMhs() {
        jmlMhs = jmlMhs + 1;
    }

    public static int getJmlMhs() {
        return jmlMhs;
    }
}
