package asprak.kelas4503.responsi;

import java.util.ArrayList;

public class Zoo {
    private String nama;
    private ArrayList<Hewan> zooList = new ArrayList<>();

    public Zoo(String nama) {
        this.nama = nama;
    }

    public void inputHewan(Hewan hewan) {
        zooList.add(hewan);
    }

    public void displayAllHewan() {
        for (Hewan hewan : zooList) {
            if (zooList.isEmpty()) {
                System.out.println("Tidak ada data");
            } else {
                System.out.println(hewan);
            }
        }
    }

    public void displayHewanByJenis(String jenis) {
        for (Hewan hewan : zooList) {
            if (jenis.equalsIgnoreCase("Karnivora")) {
                if (hewan instanceof Karnivora) {
                    System.out.println(hewan);
                }
            } else if (jenis.equalsIgnoreCase("Herbivora")) {
                if (hewan instanceof Herbivora) {
                    System.out.println(hewan);
                }
            }
        }
    }

    public void editNamaHewan(
            String jenis,
            String namaHewan,
            String namaBaru
    ) {
        for (Hewan hewan : zooList) {
            if (jenis.equalsIgnoreCase("Karnivora")) {
                if (hewan instanceof Karnivora) {
                    if (namaHewan.equalsIgnoreCase(((Karnivora) hewan).getNamaHewan())) {
                        ((Karnivora) hewan).setNamaHewan(namaBaru);
                    }
                }
            } else if (jenis.equalsIgnoreCase("Herbivora")) {
                if (hewan instanceof Herbivora) {
                    if (namaHewan.equalsIgnoreCase(((Herbivora) hewan).getNamaHewan())) {
                        ((Herbivora) hewan).setNamaHewan(namaBaru);
                    }
                }
            }
        }
    }

    public void deleteHewan(String nama) {
        for (int i = 0; i < zooList.size(); i++) {
            if (nama.equalsIgnoreCase(((Karnivora) zooList.get(i)).getNamaHewan())) {
                if (zooList.get(i) instanceof Karnivora) {
                    zooList.remove(zooList.get(i));
                } else if (zooList.get(i) instanceof Herbivora) {
                    zooList.remove(zooList.get(i));
                }
            }
        }
    }
}
