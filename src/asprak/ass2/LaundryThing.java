package asprak.ass2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LaundryThing{
    PriorityQueue<Customer> pq = new PriorityQueue<>(1, new Customer());

    public void terimaCucian(int id, String nama, int tanggal, String tipe, int berat) {
        pq.add(new Customer(id, nama, tanggal, tipe, berat));
    }

    public void show() {
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }
}

class Main {
    public static void main(String[] args) {
        LaundryThing laundry = new LaundryThing();

        laundry.terimaCucian(1, "Intan", 3, "biasa", 5);
        laundry.terimaCucian(2, "Dudi", 4, "express", 3);
        laundry.terimaCucian(3, "Ruli", 4, "kilat", 1);
        laundry.terimaCucian(4, "Susi", 5, "biasa", 2);
        laundry.terimaCucian(5, "Ira", 6, "biasa", 5);
        laundry.terimaCucian(6, "Mayang", 7, "kilat", 4);

        System.out.println("urutan:");
        laundry.show();
    }
}
