package TPdanJurnal._44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Jurnal11_44_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumber = new ArrayList<>();

        int input;

        do {
            input = scanner.nextInt();

            if (input != -1) listOfNumber.add(input);
        } while (input != -1);

        listOfNumber.sort(Collections.reverseOrder());

        for (int number : listOfNumber) System.out.print(number + " ");
    }
}