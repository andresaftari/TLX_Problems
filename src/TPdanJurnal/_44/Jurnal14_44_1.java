package TPdanJurnal._44;

import java.util.Scanner;

public class Jurnal14_44_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(findFPB(num1, num2));
    }

    public static int findFPB(int num1, int num2) {
        if (num2 <= num1 && num1 % num2 == 0) return num2;
        else if (num1 < num2) return findFPB(num2, num1);
        else return findFPB(num2, num1 % num2);
    }
}