package ISD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TokoABC toko = new TokoABC();

        Bag pollo = new Bag("C01", "Pollo", "Tas", 4);

        toko.addBag(pollo);
        toko.remove("C01");
        toko.displayBag();
    }
}
