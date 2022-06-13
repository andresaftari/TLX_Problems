package asprak.responsi.k4501;

public class Mahasiswa {
    private final String nim;
    private final String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return nim.equals(mahasiswa.nim) && nama.equals(mahasiswa.nama);
    }

    @Override
    public int hashCode() {
        int MULTIPLIER = 3;

        int h1 = nim.hashCode();
        int h2 = nama.hashCode();

        return MULTIPLIER * h1 + h2;
    }
}
