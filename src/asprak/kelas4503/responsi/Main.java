package asprak.kelas4503.responsi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Ragunan");
        Scanner sc = new Scanner(System.in);

        int opsi;   

        do {
            System.out.println("\n1. Input Data"
                    + "\n2. Display All Data"
                    + "\n3. Display By Jenis"
                    + "\n4. Edit Data"
                    + "\n5. Delete Data"
                    + "\n6. Exit"
                    + "\nPilihan: ");

            opsi = sc.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Nama Hewan: ");
                    String nama = sc.next();

                    System.out.println("Jenis Hewan: ");
                    String jenis = sc.next();
                    
                    System.out.println("Habitat Hewan: ");
                    String habitat = sc.next();

                    if (jenis.equalsIgnoreCase("Karnivora")) {
                        Karnivora kar = new Karnivora(habitat, nama);
                        zoo.inputHewan(kar);
                    } else if (jenis.equalsIgnoreCase("Herbivora")) {
                        Herbivora her = new Herbivora(habitat, nama);
                        zoo.inputHewan(her);
                    }
                    
                    break;

                case 2:
                    System.out.println("Menampilkan seluruh data\n");
                    zoo.displayAllHewan();
                    break;

                case 3:
                    System.out.println("Jenis yang mau ditampilkan: ");
                    String searchJenis = sc.next();

                    zoo.displayHewanByJenis(searchJenis);
                    break;

                case 4:
                    System.out.println("Jenis hewan yang mau diubah: ");
                    String sJenis = sc.next();

                    System.out.println("Nama hewan yang mau diubah: ");
                    String sNama = sc.next();
                    
                    System.out.println("Nama Baru: ");
                    String namaBaru = sc.next();

                    zoo.editNamaHewan(sJenis, sNama, namaBaru);
                    break;

                case 5:
                    System.out.println("Jenis hewan yang mau dihapus: ");
                    String namaHewan = sc.next();
                    
                    zoo.deleteHewan(namaHewan);
                    break;
                    
                case 6:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Tidak ada opsi " + opsi);
            }
        } while (true);
    }
}
