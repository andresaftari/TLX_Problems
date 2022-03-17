package ISD;

public class ATK implements Comparable<ATK> {
    private String kodeBarang, jenisBarang, namaBarang;
    private int stok;

    public ATK(String kodeBarang, String namaBarang, String jenisBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return "ATK{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", stok=" + stok +
                '}';
    }

    @Override
    public int compareTo(ATK o) {
        if (kodeBarang.equals(o.kodeBarang)) {
            return 0; // Kalo sama return-nya 0
        } else {
            return 1; // Kalo beda
        }
    }
}
