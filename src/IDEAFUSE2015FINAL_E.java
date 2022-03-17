import java.io.BufferedReader;
import java.io.InputStreamReader;

// LOMBA IDEAFUSE 2014 FINAL CP E
public class IDEAFUSE2015FINAL_E {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String[] data = new String[n];

            int len = data.length;
            int total = 0;

            for (int i = 0; i < len; i++) {
                String name = br.readLine();
                data[i] = name;
            }

            System.out.println(data[0]);

            for (int i = 1; i <= len + 2; i++) {
                len -= 1;
                if (i % 2 == 1) {
                    int b = len;
                    b *= 1;
                    total += b;
                    System.out.println(data[total]);
                } else if (i % 2 == 0) {
                    int c = len;
                    c *= -1;
                    total += c;
                    System.out.println(data[total]);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}