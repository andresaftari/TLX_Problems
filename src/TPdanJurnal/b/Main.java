package TPdanJurnal.b;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan ekspresi yang akan diubah :");
        String sample = scanner.next();

        System.out.println("Ekspresi postfix :");
        System.out.println(infixToPostFix(sample));
    }

    private static int operatorCheck(char ops) {
        switch (ops) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private static String infixToPostFix(String sample) {
        Stack<Character> charStack = new Stack<>();
        StringBuilder container = new StringBuilder(); // PENAMPUNG

        for (int i = 0; i < sample.length(); i++) {
            char letter = sample.charAt(i);

            if (Character.isLetterOrDigit(letter)) container.append(letter);
            else if (letter == '(') charStack.push(letter);
            else if (letter == ')') {
                while (!charStack.isEmpty() && charStack.peek() != '(') container.append(charStack.pop());

                if (!charStack.isEmpty() && charStack.peek() != '(') return "Kesalahan Inputan";
                else charStack.pop();
            } else {
                while (!charStack.isEmpty() && operatorCheck(letter) <= operatorCheck(charStack.peek())) {
                    if (charStack.peek() == '(') return "Kesalahan Inputan";
                    container.append(charStack.pop());
                }
                charStack.push(letter);
            }
        }
        while (!charStack.isEmpty()) {
            if (charStack.peek() == '(') return "Kesalahan Inputan";
            container.append(charStack.pop());
        }
        return container.toString();
    }
}