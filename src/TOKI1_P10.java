import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TOKI1_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), pecahan, temp = n;
        int[] koin = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int i : koin) {
            pecahan = temp / i;
            temp %= i;

            if (pecahan != 0) System.out.println(i + " " + pecahan);
        }
    }
}
