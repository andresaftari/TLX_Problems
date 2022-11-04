import java.io.*;
import java.util.Arrays;

public class LatihanImplementasiPengurutan_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
