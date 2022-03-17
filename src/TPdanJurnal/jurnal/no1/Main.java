package TPdanJurnal.jurnal.no1;

import java.util.Stack;

public class Main<T> {
    Stack<T> undo = new Stack<>(); // back
    Stack<T> redo = new Stack<>(); // forward

    private void tambahData(T url) {
        undo.push(url);
        redo.clear();
        System.out.println("Website " + url + " dibuka");
    }

    private void back() {
        if (undo.isEmpty()) System.out.println("Undo is empty");
        else {
            T temp = undo.pop();
            redo.push(temp);
            System.out.println("Mundur ke alamat " + undo.peek());
        }
    }

    private void forward() {
        if (redo.isEmpty()) System.out.println("Redo is empty");
        else {
            T temp = redo.pop();
            undo.push(temp);
            System.out.println("Kembali lagi ke alamat " + temp);
        }
    }

    public static void main(String[] args) {
        Main<String> backForward = new Main<>();

        backForward.tambahData("https://www.google.com/search?q=comparable+java+integer");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareto-method");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareunsigned-method");

        backForward.back();
        backForward.forward();
    }
}