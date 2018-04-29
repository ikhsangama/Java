package kampus;

public class Dosen extends Manusia {
    private String nip;
    private static int jmlDosen;

    public Dosen(String nip, String nama, String alamat, String noTlp) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.noTlp = noTlp;
        setJmlDosen();
    }

    private static void setJmlDosen() {
        jmlDosen = jmlDosen + 1;
    }


    @Override
    public void info() {
        System.out.println(
                "NIP: " + nip +
                        "\nNama: " + nama +
                        "\nAlamat: " + alamat +
                        "\nNoTlp: " + noTlp);
    }
}
