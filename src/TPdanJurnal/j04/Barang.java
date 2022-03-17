package TPdanJurnal.j04;

public class Barang {
    private String kode, nama, jenis;
    private int stok;

    public Barang(String kode, String nama, String jenis, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public String toString() {
        return getNama() + ", jenis barang " + getJenis();
    }
}