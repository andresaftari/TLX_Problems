package asprak.topik5;

public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap(String nama, double tuDas, double gaDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        System.out.println("asprak.kelas4504.topik5.Karyawan asprak.kelas4504.topik5.Tetap" +
                "\nNama: " + super.nama +
                "\nGaji Dasar:" + super.gaDas +
                "\nTunjangan Dasar: " + this.tuDas);
    }
}
