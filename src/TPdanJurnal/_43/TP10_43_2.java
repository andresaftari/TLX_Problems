package TPdanJurnal._43;

import java.util.Scanner;

public class TP10_43_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int pembalik = 0;

        while (input > 0) {
            pembalik *= 10;
            pembalik += input % 10;
            input /= 10;
        }
        System.out.println(pembalik);
    }
}