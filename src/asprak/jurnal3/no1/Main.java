package asprak.jurnal3.no1;

public class Main {
    public static void main(String[] args) {
        Jurusan d3if = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan d3si = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        Mahasiswa mhs1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703", "Agus");
        Mahasiswa mhs4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mhs5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304", "Rahmat");

        // INI NAMANYA AGREGASI, KITA TULIS DULU MAHASISWA SECARA LENGKAP
        d3if.addMhs(mhs1);
        d3if.addMhs(mhs2);
        d3if.addMhs(mhs3);

        d3si.addMhs(mhs4);
        d3si.addMhs(mhs5);
        d3si.addMhs(mhs6);
        d3si.addMhs(mhs7);

        display(d3if);
        display(d3si);
    }

    private static void display(Jurusan jurusan) {
        System.out.println("\nKode: " + jurusan.getKode() + "\nNama: " + jurusan.getNama());
        System.out.println("Daftar Mahasiswa:");

        for (Mahasiswa mhs: jurusan.getMhs()) {
            System.out.println("\t" + mhs.getNim() + " - " + mhs.getNama());
        }
    }
}
