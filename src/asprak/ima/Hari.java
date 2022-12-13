package asprak.ima;

import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String today = sc.next(), result;
        int nextHari = sc.nextInt(), index = 0;

        switch (today) {
            case "Senin":
                index = 1;
                break;
            case "Selasa":
                index = 2;
                break;
            case "Rabu":
                index = 3;
                break;
            case "Kamis":
                index = 4;
                break;
            case "Jumat":
                index = 5;
                break;
            case "Sabtu":
                index = 6;
                break;
            case "Minggu":
                index = 7;
                break;
        }

        int hari = (index + nextHari) % 7;
        result = hari == 0 ? "Minggu" :
                hari == 1 ? "Senin" :
                        hari == 2 ? "Selasa" :
                                hari == 3 ? "Rabu" :
                                        hari == 4 ? "Kamis" :
                                                hari == 5 ? "Jumat" :
                                                        hari == 6 ? "Sabtu" : "";

        // 1000101
        // << 1 0001010
        System.out.println(result);
    }
}
