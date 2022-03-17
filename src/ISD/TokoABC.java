package ISD;

import java.util.ArrayList;
import java.util.Collections;

public class TokoABC {
    private final ArrayList<ATK> listAtk = new ArrayList<>(); // [ 1. pensil ]
    private final ArrayList<Bag> listBag = new ArrayList<>();

    public void addAtk(ATK atk) {
        listAtk.add(atk);
    }

    public void addBag(Bag bag) {
        listBag.add(bag);
    }

    public void remove(String kode) {
        int indexAtk = listAtk.size() - 1;
        int indexBag = listBag.size() - 1;

        if (kode.contains("A") || kode.contains("B")) {
            for (int i = 0; i <= listAtk.size(); i++) {
                if (kode.equals(listAtk.get(indexAtk).getKodeBarang())) {
                    listAtk.remove(indexAtk);
                }
            }
        } else if (kode.contains("C")) {
            for (int i = 0; i <= listBag.size(); i++) {
                if (kode.equals(listBag.get(indexBag).getKodeBarang())) {
                    listBag.remove(indexBag);
                }
            }
        }
    }

    public void editAtk(String kode, ATK atkBaru) {
        for (int i = 0; i < listAtk.size(); i++) {
            if (listAtk.get(i).getKodeBarang().equals(kode)) {
                listAtk.set(i, atkBaru);
            } else {
                System.out.println("Kode yang anda cari tidak ada");
            }
        }
    }

    public void editBag(String kode, Bag bagBaru) {
        for (int i = 0; i < listBag.size(); i++) {
            if (listBag.get(i).getKodeBarang().equals(kode)) {
                listBag.set(i, bagBaru);
            } else  {
                System.out.println("Kode yang anda cari tidak ada");
            }
        }
    }

    public void displayATK() {
        Collections.sort(listAtk);

        for (ATK atk : listAtk) {
            System.out.println(atk);
        }
    }

    public void displayBag() {
        Collections.sort(listBag);

        for (Bag bag : listBag) {
            System.out.println(bag);
        }
    }
}
