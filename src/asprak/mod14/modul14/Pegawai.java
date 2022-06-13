package asprak.mod14.modul14;

import java.util.HashMap;
import java.util.Map;

public class Pegawai {
    private final String NIP;
    private final String nama;

    public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 29; // Bilangan prima sebagai multiplier

        int hash1 = NIP.hashCode();
        int hash2 = nama.hashCode();

        return HASH_MULTIPLIER * hash1 + hash2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pegawai pegawai = (Pegawai) obj;
        return NIP.equals(pegawai.NIP) && nama.equals(pegawai.nama);
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "NIP='" + NIP + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Map<Pegawai, String> mapPegawai = new HashMap<>();

        Pegawai pegawai1 = new Pegawai("1234", "Susi");
        Pegawai pegawai2 = new Pegawai("1235", "Ria");
        Pegawai pegawai3 = new Pegawai("1236", "Tuti");

        mapPegawai.put(pegawai1, "Malang");
        mapPegawai.put(pegawai2, "Kudus");
        mapPegawai.put(pegawai3, "Malang");

        System.out.println(mapPegawai.get(pegawai1));
        System.out.println(mapPegawai.get(pegawai2));
        System.out.println(mapPegawai.get(pegawai3));

        for (Map.Entry<Pegawai, String> entry : mapPegawai.entrySet()) {
            System.out.println(entry.getKey() + " kota asal : " + entry.getValue());
        }
    }
}
