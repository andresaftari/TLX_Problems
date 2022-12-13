package asprak.jurnal3.no2array;

public class Nurse {
    private int idPerawat;
    private String namaPerawat;

    public Nurse(int idPerawat, String namaPerawat) {
        this.idPerawat = idPerawat;
        this.namaPerawat = namaPerawat;
    }

    public int getIdPerawat() {
        return idPerawat;
    }

    public String getNamaPerawat() {
        return namaPerawat;
    }

    @Override
    public String toString() {
        return "ID Perawat: " + idPerawat + " - Nama: " + namaPerawat;
    }
}