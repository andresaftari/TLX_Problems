package TPdanJurnal.bintostr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // BufferedReader sama kayak Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Try untuk cek inputan
        try {
            String data = br.readLine();

            // Alat konversi biner ke string
            String raw = Arrays.stream(data.split(" "))
                    .map(binary -> Integer.parseInt(binary, 2))
                    .map(Character::toString)
                    .collect(Collectors.joining());

            System.out.println(raw);
        } catch (Exception e) { // Catch untuk ambil error input
            System.out.println(e.getMessage());
        }
    }
    // Contoh : 01001000 01100101 01101100 01101100 01101111 (HELLO)
}