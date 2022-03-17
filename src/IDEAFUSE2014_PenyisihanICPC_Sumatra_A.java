import java.util.Scanner;

public class IDEAFUSE2014_PenyisihanICPC_Sumatra_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arrSize = new int[len];

        for (int i = 0; i < arrSize.length; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            checkTheSameNumber(num1, num2);
        }
    }

    private static void checkTheSameNumber(int number1, int number2) {
        int data1 = 0, data2 = 0;
        int numSize = number2 - number1;

        for (int i = 0; i < numSize; i++) {
            for (int j = number1; j <= number2 ; j++) {
                data1 = j;
//                System.out.println(data1);
            }
            for (int j = number2; j>= number1 ; j--) {
                data2 = j;
//                System.out.println(data2);
            }
            if (data1 == data2) System.out.println(data1);
        }

    }
}
