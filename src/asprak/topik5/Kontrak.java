package asprak.topik5;

public class Kontrak extends Karyawan {
    private double waktu;

    public Kontrak(String nama, double waktu, double gaDas) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        System.out.println("asprak.kelas4504.topik5.Karyawan asprak.kelas4504.topik5.Kontrak" +
                "\nNama: " + super.nama +
                "\nGaji Dasar: " + super.gaDas +
                "\nLama asprak.kelas4504.topik5.Kontrak: " + this.waktu);
    }
}
