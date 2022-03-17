import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BNPCHS2011_Penyisihan_C {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int sample = scanner.nextInt();
//
//        for (int i = 0; i < sample; i++) {
//            int TPdanJurnal.a = scanner.nextInt();
//            int TPdanJurnal.b = scanner.nextInt();
//
//            int total = 0;
//            for (int j = TPdanJurnal.a; j <= TPdanJurnal.b; j++) if (isAlmostPrime(j)) total++;
//            System.out.println(total);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int data = Integer.parseInt(Arrays.toString(br.readLine().split(" ")));
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static boolean isPrime(int sample) {
        if (sample == 2) return true;
        else if (sample % 2 == 0) return false;

        int space = (int) Math.sqrt(sample);

        for (int i = 3; i <= space; i += 2) if (sample % i == 0) return false;
        return true;
    }

    private static boolean isAlmostPrime(int sample) {
        if (isPrime(sample)) return false;
        else for (int i = 2; i < sample; i++) if (sample % i == 0) if (!isPrime(i)) return false;

        return true;
    }
}
