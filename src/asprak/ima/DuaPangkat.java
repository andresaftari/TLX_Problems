package asprak.ima;

public class DuaPangkat {
    public static void main(String[] args) {
        System.out.println(duapangkat(5));
    }

    private static int duapangkat(int num) {
        if (num == 0) {
            return 1;
        } else {
            return duapangkat(num - 1) * 2;
        }
    }
}