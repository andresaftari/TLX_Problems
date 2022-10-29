package asprak.ima;

public class Test {
    public static void main(String[] args) {
        ops(3, "A", "B", "C");
    }

    private static void ops(int n, String start, String mid, String dest) {
        if (n == 1) {
            return;
        } else {
            ops(n - 1, start, mid, dest);
            System.out.println(start + " move to " + dest);
            ops(n - 1, mid, dest, start);
        }
    }
}
