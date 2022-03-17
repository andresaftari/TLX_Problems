package TPdanJurnal.jurnal.no2;

// POJO (Plain Old Java Object) / Object Class / Model Class / ADT class / Generic / Data class / Entity
public class Pembeli {
    private int noPanggilan, jumlah;
    private String nama, jenis;

    public Pembeli(int noPanggilan, String nama, String jenis, int jumlah) {
        this.noPanggilan = noPanggilan;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.nama = nama;
    }

    public int getNoPanggilan() {
        return noPanggilan;
    }

    public String getNama() {
        return nama;
    }
}