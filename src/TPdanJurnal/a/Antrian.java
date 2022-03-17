package TPdanJurnal.a;

import java.util.LinkedList;
import java.util.Queue;

// UTILITY (TOOLS) class Antrian
public class Antrian {
    private static Queue<Umum> queueUmum = new LinkedList<>();
    private static Queue<Anak> queueAnak = new LinkedList<>();
    private static Queue<Gigi> queueGigi = new LinkedList<>();

    public void ambilNomor(String no, String nama, String jenis) {
        switch (no.substring(0, 1)) {
            case "A":
                if (queueUmum.size() > 0)
                    System.out.println(nama + ", Anda menunggu " + queueUmum.size() + " orang lagi");
                queueUmum.offer(new Umum(no, nama, jenis));
                break;

            case "B":
                if (queueAnak.size() > 0)
                    System.out.println(nama + ", Anda menunggu " + queueAnak.size() + " orang lagi");
                queueAnak.offer(new Anak(no, nama, jenis));
                break;

            case "C":
                if (queueGigi.size() > 0)
                    System.out.println(nama + ", Anda menunggu " + queueGigi.size() + " orang lagi");
                queueGigi.offer(new Gigi(no, nama, jenis));
                break;
        }
    }

    public void hapusAntrian() {
        queueGigi.clear();
        queueAnak.clear();
        queueUmum.clear();
    }

    public void panggilan(String nomor) {
        switch (nomor.substring(0, 1)) {
            case "A":
                if (queueUmum.isEmpty()) System.out.println("Antrian masih kosong");
                else {
                    System.out.println("Nomor " + queueUmum.peek().getNomor() + " untuk dokter Dokter Umum silahkan masuk ke ruang 1");
                    queueUmum.poll();
                }
                break;

            case "B":
                if (queueAnak.isEmpty()) System.out.println("Antrian masih kosong");
                else {
                    System.out.println("Nomor " + queueAnak.peek().getNomor() + " untuk dokter Dokter Umum silahkan masuk ke ruang 2");
                    queueAnak.poll();
                }
                break;

            case "C":
                if (queueGigi.isEmpty()) System.out.println("Antrian masih kosong");
                else {
                    System.out.println("Nomor " + queueGigi.peek().getNomor() + " untuk dokter Dokter Umum silahkan masuk ke ruang 3");
                    queueGigi.poll();
                }
                break;
        }
    }
}