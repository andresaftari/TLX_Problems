package TPdanJurnal._43;

import java.util.Scanner;

public class TP05_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float suhu1 = scanner.nextFloat();
        float suhu2 = scanner.nextFloat();
        float suhu3 = scanner.nextFloat();

        System.out.print(toCelcius(suhu1) + " " + toCelcius(suhu2) + " " + toCelcius(suhu3));
    }

    private static float toCelcius(float suhu) {
        return (suhu - 32) * 5 / 9f;
    }
}