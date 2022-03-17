package TPdanJurnal.rifa.adt;

// ADT / model / generic / POJO (Plain Old Java Object) / Object
public class Resepsi {
    // 1. Punya Fields
    private String pemilik, namakatering;
    private int jumlahPendatang;

    // 2. Harus ada constructor (kalau ada fields)
    public Resepsi(String pemilik, String namakatering, int jumlahPendatang) {
        this.pemilik = pemilik;
        this.namakatering = namakatering;
        this.jumlahPendatang = jumlahPendatang;
    }

    // 3. Harus ada getter
    public String getPemilik() {
        return pemilik;
    }

    public String getNamakatering() {
        return namakatering;
    }

    public int getJumlahPendatang() {
        return jumlahPendatang;
    }

    @Override
    public String toString() {
        return "Data Resepsi:" +
                "\nPemilik = " + getPemilik() +
                "\nNama Katering yang disewa = " + getNamakatering() +
                "\nJumlah Pendatang/Tamu = " + getJumlahPendatang();
    }
}