import java.util.Scanner;

public class NgodingSeruOktober2015_Pemula_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) data[i] = scanner.nextInt();
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == 0) System.out.print(data[i]);
            else System.out.print(data[i] + ",");
        }
    }
}