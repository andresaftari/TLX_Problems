import java.util.Scanner;

public class NgodingSeruOktober2015_Pemula_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nStart = scanner.nextInt();
        int nData = scanner.nextInt();
        int selisih = scanner.nextInt();

        for (int i = 1; i <= nData; i++) {
            if (i == 1) System.out.println(nStart);
            else if (i > 1){
                nStart += selisih;
                System.out.println(nStart);
            }
        }
    }
}