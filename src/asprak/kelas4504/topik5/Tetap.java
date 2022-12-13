package asprak.kelas4504.topik5;

public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap(String nama, double gaDas, double tuDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        System.out.println("asprak.kelas4504.topik5.Karyawan asprak.kelas4504.topik5.Tetap:\n"
                + "Nama: " + super.nama
                + " Gaji Dasar: " + super.gaDas
                + " Tunjangan Dasar: " + this.tuDas);
    }
}
