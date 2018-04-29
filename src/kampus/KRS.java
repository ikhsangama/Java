package kampus;

public class KRS {
    private Mahasiswa mhs;
    private Kuliah kul1, kul2, kul3;
    private int semester;
    private String kelas;
    private static int jmlKrs;

    public KRS(Mahasiswa mhs, Kuliah kul1, Kuliah kul2, Kuliah kul3, int semester, String kelas){
        this.mhs = mhs;
        this.kul1 = kul1;
        this.kul2 = kul2;
        this.kul3 = kul3;
        this.semester = semester;
        this.kelas = kelas;
        setJmlKrs();
    }

    private void setJmlKrs() {
        jmlKrs = jmlKrs+1;
    }

    public void info(){
        System.out.println(
                "Mahasiswa: "+ mhs.nama+
                        "\nKuliah1: "+ kul1.getNamaKuliah() +
                        "\nKuliah2: "+ kul2.getNamaKuliah() +
                        "\nKuliah3: "+ kul3.getNamaKuliah() +
                        "\nSemester: "+ semester +
                        "\nKelas: "+ kelas
        );
    }

    public void gantiKul(Kuliah baru1, Kuliah baru2, Kuliah baru3) {
        this.kul1 = baru1;
        this.kul2 = baru2;
        this.kul3 = baru3;
    }
}
