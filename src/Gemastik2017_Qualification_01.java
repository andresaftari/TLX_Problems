import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gemastik2017_Qualification_01 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int murid = Integer.parseInt(br.readLine());
            int[] patternA = new int[murid];
            int[] patternB = new int[murid];

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = 0, total = 0;

            while (i < murid) {
                patternA[i] = Integer.parseInt(st1.nextToken());
                patternB[i] = Integer.parseInt(st2.nextToken());

                i++;
            }

            for (int a : patternA) for (int b : patternB) total += a + b;
            System.out.println(total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}