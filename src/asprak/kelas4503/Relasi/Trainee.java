package asprak.kelas4503.Relasi;

public class Trainee extends Member {
    private int lamaTraining;

    public Trainee(String nama, int umur, int lamaTraining) {
        super(nama, umur);
        this.lamaTraining = lamaTraining;
    }

    public int getLamaTraining() {
        return lamaTraining;
    }

    public void display() {
        System.out.println(
                "Nama: " + nama
                + "\nUmur: " + umur
                + "\nLama Training: " + lamaTraining
        );
    }
}
