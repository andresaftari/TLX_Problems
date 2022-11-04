package asprak.ima;

public class Test {
    public static void main(String[] args) {
        ops(3, "A", "C", "B");
    }

    private static void ops(int n, String start, String dest, String mid) {
        if (n == 1) {
            System.out.println("Disc 1 dari " + start + " ke " + dest);
            return;
        }

        ops(n - 1, start, mid, dest);
        System.out.println("Disc " + n + " dari " + start + " ke " + dest);
        ops(n - 1, mid, dest, start);
    }
}
