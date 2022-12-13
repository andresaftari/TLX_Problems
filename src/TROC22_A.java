import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TROC22_A {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int data = Integer.parseInt(br.readLine());

            if (String.valueOf(data).contains("0") && !String.valueOf(data).startsWith("0")) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
