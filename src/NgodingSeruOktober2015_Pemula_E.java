import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NgodingSeruOktober2015_Pemula_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int input;

        do {
            input = scanner.nextInt();
            arr.add(input);

            Collections.sort(arr);
            if (input == 1) for (int i = 1; i < arr.size(); i++) System.out.println(arr.get(i));
            else if (input == 0) {
                Collections.reverse(arr);
                for (int i = 0; i < arr.size() - 1; i++) System.out.println(arr.get(i));
            }
        } while (input != 0 && input != 1);
    }
}