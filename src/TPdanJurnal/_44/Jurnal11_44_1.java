package TPdanJurnal._44;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jurnal11_44_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList<>();

        String input;

        do {
            input = scanner.next();
            listName.add(input);
        } while (!input.equals("-"));

        Random random = new Random();
        int listIndex = random.nextInt(listName.size());

        System.out.println(listName.get(listIndex));
    }
}