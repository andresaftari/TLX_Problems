package asprak.agregasi;

public class Mahasiswa extends Kelas {
    public Mahasiswa(String kode) {
        super(kode);
    }

    @Override
    public void cekJamMasuk() {
        super.cekJamMasuk();
        // jadi isi command nya disini
    }

    @Override
    public void cekJamKeluar() {
        super.cekJamKeluar();
        // jadi isi command nya disini
    }
}
