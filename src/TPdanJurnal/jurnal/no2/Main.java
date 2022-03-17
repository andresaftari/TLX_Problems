package TPdanJurnal.jurnal.no2;

import java.util.LinkedList;
import java.util.Queue;

// Driver class
public class Main {
    Queue<Pembeli> antrian = new LinkedList<>();

    // Driver method
    public static void main(String[] args) {
        Main roti = new Main();

        roti.ambilNomor(1, "Roti Upin", "roti manis", 10);
        roti.ambilNomor(2, "Roti Ipin", "roti manis", 5);
        roti.ambilNomor(3, "Roti Ismail", "roti manis", 4);
        roti.panggilanRoti();
        roti.ambilNomor(4,"Roti Santi","roti asin",2);
    }

    public void ambilNomor(int nomor, String nama, String jenis, int jumlah) {
        int waiting = antrian.size();

        antrian.add(new Pembeli(nomor, nama, jenis, jumlah));
        if (waiting > 0) System.out.println("Anda menunggu " + waiting + " orang lagi");
    }

    public void panggilanRoti() {
        if (!antrian.isEmpty()) {
            System.out.println("Nomor " +
                    antrian.peek().getNoPanggilan() + " : pembelian " +
                    antrian.peek().getNama() + " sudah siap"
            );
            antrian.poll();
        }
    }
}