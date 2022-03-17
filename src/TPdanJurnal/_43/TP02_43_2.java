package TPdanJurnal._43;

import java.util.Scanner;

public class TP02_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println(
                "Halo, " + name + ".\n"
                + "Ternyata usiamu baru " + age + " tahun ya!"
        );
    }
}