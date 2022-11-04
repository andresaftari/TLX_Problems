package asprak.ima;

public class PseudoThing {
    private static int[] example = new int[3];

    public static void main(String[] args) {
        example[0] = 23;
        example[1] = 12;
        example[2] = 501;

        System.out.println(minimum(0));
    }

    private static int minimum(int n) {
        if (n == example.length - 1) {
            return example[n];
        }
        
        int p = minimum(n + 1);

        if (example[n] < p) {
            return example[n];
        } else {
            return p;
        }
    }
}