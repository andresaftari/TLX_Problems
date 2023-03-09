package asprak;

public class Example {
    public static int factorial1(int number) {
        int res = 1;

        for (int i = number; i >= 1; i--) {
            res *= i;
        }

        return res;
    }

    public static void factorial2(int number) {
        int res = 1;

        for (int i = number; i >= 1; i--) {
            res *= i;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
//        String cek = "ha";

        factorial2(3); // void (procedural)
        System.out.println(factorial1(3)); // return (functional)
    }
}
