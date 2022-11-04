package asprak.kelas4505;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        KelasInduk induk = new KelasInduk("Pegawai");
        // contoh instanceof
        KelasInduk anak1 = new KelasAnak1("Irsal", "Item");
        KelasInduk anak2 = new KelasAnak2("Yoga", "Nyaleg");

       if (anak1 instanceof KelasAnak1) {
           System.out.println();
       }

    }
}
