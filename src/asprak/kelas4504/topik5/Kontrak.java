package asprak.kelas4504.topik5;

public class Kontrak extends Karyawan {
    private int waktu;

    public Kontrak(String nama, double gaDas, int waktu) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        System.out.println("asprak.kelas4504.topik5.Karyawan asprak.kelas4504.topik5.Kontrak:\n"
                + "Nama: " + super.nama
                + " Gaji Dasar: " + super.gaDas
                + " Waktu asprak.kelas4504.topik5.Kontrak: " + this.waktu);
    }
}
