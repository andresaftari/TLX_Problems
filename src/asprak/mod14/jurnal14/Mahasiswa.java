package asprak.mod14.jurnal14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mahasiswa {
    private final String nim;
    private final String kelas;
    private final String nama;

    public Mahasiswa(String nim, String kelas, String nama) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", kelas='" + kelas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Mahasiswa> mapper = new HashMap<>();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        int option;

        do {
            System.out.println("\nPilih salah satu aksi berikut: " +
                    "\n1. Menambah data mahasiswa" +
                    "\n2. Menghapus data mahasiswa" +
                    "\n3. Menyimpan nilai mahasiswa" +
                    "\n4. Menampilkan seluruh nilai mahasiswa + rata-rata" +
                    "\n5. Exit");

            option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.println("\nNama : ");
                    String nama = br.readLine();
                    System.out.println("NIM : ");
                    String nim = br.readLine();
                    System.out.println("Kelas");
                    String kelas = br.readLine();

                    listMahasiswa.add(new Mahasiswa(nim, kelas, nama));
                    System.out.println("Input data mahasiswa berhasil");
                    break;

                case 2:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong!");
                    } else {
                        System.out.println("\nNIM yang ingin dihapus: ");
                        String rnim = br.readLine();

                        listMahasiswa.removeIf(mahasiswa -> mahasiswa.getNim().equalsIgnoreCase(rnim));
                        System.out.println("Hapus data mahasiswa berhasil");
                    }
                    break;

                case 3:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong!");
                    } else {
                        System.out.println("\nNIM mahasiswa yang akan dinilai : ");
                        String nnim = br.readLine();

                        for (Mahasiswa mahasiswa : listMahasiswa) {
                            if (mahasiswa.getNim().equalsIgnoreCase(nnim)) {
                                System.out.println("Input nilai [1-100]: ");

                                int nilai = Integer.parseInt(br.readLine());
                                mapper.put(nilai, mahasiswa);

                                System.out.println("Input nilai berhasil");
                            }
                        }
                    }
                    break;

                case 4:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong!");
                    } else {
                        Set<Integer> keySets = mapper.keySet();
                        int total = 0;

                        for (Integer key : keySets) {
                            Mahasiswa mahasiswa = mapper.get(key);
                            System.out.println(mahasiswa.getNim() + " -> " + key);

                            total += key;
                        }

                        int means = total / listMahasiswa.size();
                        System.out.println("\nNilai Rata-Rata: " + means);
                    }
                    break;

                case 5:
                    System.out.println("GOODBYE!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Tidak pilihan opsi: " + option);
            }
        } while (true);
    }
}
