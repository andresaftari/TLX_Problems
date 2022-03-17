import java.util.Scanner;

public class NgodingSeruOktober2015_Pemula_G {
    static char[] charset = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int a = scanner.nextInt();

        if (k >= 2) {
            for (char karakter : charset) {
                if (c == karakter) for (int row = 0; row < k; row++) {
                    if (row == 0 || row == k - 1) {
                        System.out.print(a);
                        for (int col = 1; col < k - 1; col++) System.out.print(c);
                        System.out.print(a + "\n");
                    } else {
                        System.out.print(c);
                        for (int col = 1; col < k - 1; col++) System.out.print(a);
                        System.out.print(c + "\n");
                    }
                }
            }
        }
    }
}