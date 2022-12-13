package asprak.ass24501;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Order> testQueue = new PriorityQueue<>();

        Order order4 = new Order("Roti Coklet", 1200, 12);
        Order order1 = new Order("Roti Coklat", 100, 10);
        Order order2 = new Order("Roti Coklut", 1700, 27);
        Order order5 = new Order("Roti Coklut", 1700, 80);
        Order order3 = new Order("Roti Coklot", 1100, 18);

        testQueue.add(order4);
        testQueue.add(order1);
        testQueue.add(order2);
        testQueue.add(order3);
        testQueue.add(order5);

        while (testQueue.size() > 0) System.out.println(testQueue.poll());
    }
}

class Order implements Comparable<Order> {
    String pesanan;
    Integer kategoriJarak, jarak, nomor;

    public Order(String pesanan, int jarak, int nomor) {
        this.pesanan = pesanan;
        this.jarak = jarak;
        this.nomor = nomor;

        if (jarak > 0 && jarak < 500) kategoriJarak = 1;
        else if (jarak >= 500 && jarak < 1000) kategoriJarak = 2;
        else if (jarak >= 1000 && jarak < 1500) kategoriJarak = 3;
        else if (jarak >= 1500 && jarak <= 2000) kategoriJarak = 4;
    }

    @Override
    public String toString() {
        return "Order{" +
                "pesanan='" + pesanan + '\'' +
                ", kategoriJarak=" + kategoriJarak +
                ", jarak=" + jarak +
                ", nomor=" + nomor +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        if (o.kategoriJarak.compareTo(this.kategoriJarak) == 0) {
            return this.nomor.compareTo(o.nomor);
        } else {
            return o.kategoriJarak.compareTo(this.kategoriJarak);
        }
    }
}

