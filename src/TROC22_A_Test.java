import java.util.Scanner;

public class TROC22_A_Test {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int data = br.nextInt();

        if (String.valueOf(data).contains("0") && !String.valueOf(data).startsWith("0")) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}