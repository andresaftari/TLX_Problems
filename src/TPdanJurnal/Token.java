package TPdanJurnal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
            for (int n : arr) System.out.println(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
