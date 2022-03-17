import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class TraceLetter {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vowel = 0, cons = 0;

        try {
            String data = "";
            while (data.length() < 15) data = br.readLine();

            for (int i = 0; i < data.length(); i++) {
                switch (data.toLowerCase(Locale.ROOT).charAt(i)) {
                    case 'a':
                    case 'i':
                    case 'e':
                    case 'u':
                    case 'o':
                        vowel++;
                        break;
                }
            }



        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
