package asprak.mod14.jurnal1402;

import java.util.*;

public class Mahasiswa {
    private final String nim;
    private final String nama;
    private final String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Mahasiswa mahasiswa = (Mahasiswa) o;
        return nim.equals(mahasiswa.nim) && nama.equals(mahasiswa.nama) && kelas.equals(mahasiswa.kelas);
    }

    @Override
    public int hashCode() {
        int MULTIPLIER = 31;

        int h1 = nim.hashCode();
        int h2 = nama.hashCode();
        int h3 = kelas.hashCode();

        return MULTIPLIER * h1 + h2 + h3;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Map<Mahasiswa, Integer> mapper = new HashMap<>();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        // Nambah mahasiswa
        listMahasiswa.add(new Mahasiswa("1234", "Saya", "123"));
        listMahasiswa.add(new Mahasiswa("2345", "Suyu", "456"));
        listMahasiswa.add(new Mahasiswa("3456", "Soyo", "789"));

        // Ngapus mahasiswa
        listMahasiswa.remove(1);

        // Input nilai
        mapper.put(new Mahasiswa("1234", "Saya", "123"), 80);
        mapper.put(new Mahasiswa("3456", "Soyo", "789"), 100);

        // Output nilai + rata2
        int total = 0;
        Set<Mahasiswa> keyNilai = mapper.keySet();

        for (Mahasiswa mahasiswa : keyNilai) {
            int nilai = mapper.get(mahasiswa);

            total += nilai; // Menghitung total nilai
            System.out.println(mahasiswa + " " + nilai);
        }

        int rata2 = total / listMahasiswa.size(); // Menghitung rata-rata
        System.out.println("Nilai rata-rata: " + rata2);
    }
}
