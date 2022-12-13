package asprak.kelas4503.Relasi;

public class Member {

    protected String nama;
    protected int umur;

    public Member(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void display() {
        System.out.println(
                "Nama: " + nama
                + "\nUmur: " + umur
        );
    }
}
