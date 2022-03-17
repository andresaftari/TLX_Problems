import java.text.DecimalFormat;
import java.util.Scanner;

// LOMBA IDEAFUSE 2014 FINAL CP C
public class IDEAFUSE2014FINAL_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeA = scanner.nextInt();
        int sizeB = scanner.nextInt();

        int[] arr = new int[sizeB];

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            temp += temp;

            if (temp < sizeA) arr[i] = scanner.nextInt();
        }

        int nWakil = sizeA - 1;
        float nMin = (float) sizeB / (float) nWakil;

        DecimalFormat dcf = new DecimalFormat("#0.00000");
        String format = dcf.format(nMin / sizeA);

        System.out.println(format);
    }
}