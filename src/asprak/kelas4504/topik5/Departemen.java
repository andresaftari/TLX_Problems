package asprak.kelas4504.topik5;

import java.util.ArrayList;

public class Departemen {

    private String nama;
    private ArrayList<Karyawan> kar = new ArrayList<>();

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k) {
        this.kar.add(k);
    }

    public void displayAll() {
        for (Karyawan karyawan : kar) {
            karyawan.display();
        }
    }

    public void displayKontrak() {
        for (Karyawan karyawan : kar) {
            if (karyawan instanceof Kontrak) {
                karyawan.display();
            }
        }
    }

    public void displayTetap() {
        for (Karyawan karyawan : kar) {
            if (karyawan instanceof Tetap) {
                karyawan.display();
            }
        }
    }
}
