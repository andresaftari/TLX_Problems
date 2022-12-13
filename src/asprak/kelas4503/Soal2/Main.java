package asprak.kelas4503.Soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pegawai> sdmList = new ArrayList<>();
    private static ArrayList<Pegawai> keuanganList = new ArrayList<>();
    private static ArrayList<Pegawai> produksiList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("1. Input Pegawai\n"
                    + "2. Edit Pegawai\n"
                    + "3. Tampilin data\n"
                    + "4. Tampilin data by dept\n"
                    + "5. Tampilin data by range\n"
                    + "6. Exit");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    inputPegawai();
                    break;

                case 2:
                    editPegawai();
                    break;

                case 3:
                    displayAll();
                    break;

                case 4:
                    displayPerDept();
                    break;

                case 5:
                    displayByRange();
                    break;

                case 6:
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Gaada pilihan " + pilihan);
            }
        } while (true);
    }

    private static void inputPegawai() {
        System.out.println("ID: ");
        String id = sc.next();

        System.out.println("Nama: ");
        String nama = sc.next();

        System.out.println("Alamat: ");
        String alamat = sc.next();

        System.out.println("Departemen: ");
        String dept = sc.next();

        System.out.println("Gaji: ");
        int gaji = sc.nextInt();

        if (dept.equalsIgnoreCase("SDM")) {
            sdmList.add(new Pegawai(id, nama, alamat, dept, gaji));
        } else if (dept.equalsIgnoreCase("Keuangan")) {
            keuanganList.add(new Pegawai(id, nama, alamat, dept, gaji));
        } else if (dept.equalsIgnoreCase("Produksi")) {
            produksiList.add(new Pegawai(id, nama, alamat, dept, gaji));
        }
    }

    private static void editPegawai() {
        System.out.println("Dept yang mau dicari: ");
        String searchDept = sc.next();

        System.out.println("ID yang mau dicari");
        String searchId = sc.next();

        if (searchDept.equalsIgnoreCase("SDM")) {
            for (Pegawai peg : sdmList) {
                if (peg.getId().equalsIgnoreCase(searchId)) {
                    System.out.println("Ubah nama: ");
                    String nama = sc.next();
                    System.out.println("Ubah alamat: ");
                    String alamat = sc.next();
                    System.out.println("Ubah gaji: ");
                    int gaji = sc.nextInt();
                    
                    peg.setNama(nama);
                    peg.setAlamat(alamat);
                    peg.setGaji(gaji);
                }
            }
        } else if (searchDept.equalsIgnoreCase("Keuangan")) {
            for (Pegawai peg : keuanganList) {
                if (peg.getId().equalsIgnoreCase(searchId)) {
                    System.out.println("Ubah nama: ");
                    String nama = sc.next();
                    System.out.println("Ubah alamat: ");
                    String alamat = sc.next();
                    System.out.println("Ubah gaji: ");
                    int gaji = sc.nextInt();
                    
                    peg.setNama(nama);
                    peg.setAlamat(alamat);
                    peg.setGaji(gaji);
                }
            }
        } else if (searchDept.equalsIgnoreCase("Produksi")) {
            for (Pegawai peg : produksiList) {
                if (peg.getId().equalsIgnoreCase(searchId)) {
                    System.out.println("Ubah nama: ");
                    String nama = sc.next();
                    System.out.println("Ubah alamat: ");
                    String alamat = sc.next();
                    System.out.println("Ubah gaji: ");
                    int gaji = sc.nextInt();
                    
                    peg.setNama(nama);
                    peg.setAlamat(alamat);
                    peg.setGaji(gaji);
                }
            }
        }
    }

    private static void displayAll() {
        for (Pegawai peg : sdmList) {
            System.out.println(peg);
        }

        for (Pegawai peg : keuanganList) {
            System.out.println(peg);
        }

        for (Pegawai peg : produksiList) {
            System.out.println(peg);
        }
    }

    private static void displayPerDept() {
        System.out.println("Dept yang mau dicari: ");
        String dept = sc.next();

        if (dept.equalsIgnoreCase("SDM")) {
            for (Pegawai peg : sdmList) {
                System.out.println(peg);
            }
        } else if (dept.equalsIgnoreCase("Keuangan")) {
            for (Pegawai peg : keuanganList) {
                System.out.println(peg);
            }
        } else if (dept.equalsIgnoreCase("Produksi")) {
            for (Pegawai peg : produksiList) {
                System.out.println(peg);
            }
        }
    }

    private static void displayByRange() {
        System.out.println("Range gaji yang mau dicari: ");
        int rangegaji = sc.nextInt();

        for (Pegawai peg : sdmList) {
            if (peg.getGaji() > rangegaji) {
                System.out.println(peg);
            }
        }

        for (Pegawai peg : keuanganList) {
            if (peg.getGaji() > rangegaji) {
                System.out.println(peg);
            }
        }

        for (Pegawai peg : produksiList) {
            if (peg.getGaji() > rangegaji) {
                System.out.println(peg);
            }
        }

    }
}
