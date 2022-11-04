package asprak.topik5;

import java.util.ArrayList;

public class Departemen {
    private String nama;
    ArrayList<Karyawan> kar = new ArrayList<>();

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k) {
        kar.add(k);
    }

    public void displayAll() {
        for (Karyawan k : kar) {
            k.display();
        }
    }

    public void displayKontrak() {
        for (Karyawan k : kar) {
            if (k instanceof Kontrak) {
                k.display();
            }
        }
    }

    public void displayTetap() {
        for (Karyawan k : kar) {
            if (k instanceof Tetap) {
                k.display();
            }
        }
    }
}
