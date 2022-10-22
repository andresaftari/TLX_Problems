package asprak;

import java.util.ArrayList;
import java.util.Collections;

public class PhiTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // INI ARRAYLIST
        ArrayList<Integer> listSemuaKelas = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);

        list.add(1);
        list.add(3);
        list.add(2);

        int maxKelas1 = Collections.max(list);
        listSemuaKelas.add(maxKelas1);
//        listSemuaKelas.add(maxKelas2);
//        listSemuaKelas.add(maxKelas3);

        int maxSemuaKelas =  Collections.max(listSemuaKelas); // iyeu jawaban na


        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

//        Collections.sort(list); // Sort kecil ke besar
//        list.sort(Collections.reverseOrder()); // Sort besar ke kecil

        int rata2 = 0;
        // FOR LOOP 1
        for (Integer integer : list) {
            rata2 = rata2 + integer;
        }

        // FOR LOOP 2
//        for (int i = 0; i < list.size(); i++) {
//            rata2 = rata2 + list.get(i);
//        }
        System.out.println("Rata Ratanya : " + (rata2 / list.size()));
    }
}

