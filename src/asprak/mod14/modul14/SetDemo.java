package asprak.mod14.modul14;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>(13);

        data.add("Tuti");
        data.add("Doni");
        data.add("Susi");
        data.add("Kyo");
        data.add("Mirah");
        data.add("Rudi");
        data.add("Rista");
        data.add("Nanda");
        data.add("Bintang");
        data.add("Lintang");
        data.add("Ria");
        data.add("Lintang");

        // Kalo kita output langsung
        for (String nama1 : data) {
            System.out.print(nama1 + " ");
        }
        System.out.println();
        // Kalo kita output langsung

        // Kalo Lintang diremove
        data.remove("Lintang");

        for (String nama2 : data) {
            System.out.print(nama2 + " ");
        }
        System.out.println();
        // Kalo Lintang diremove
    }
}
