package asprak;

public class TestSlash {
    public static void main(String[] args) {
        int data = 100;
        int res = data >>> 1; // triple shift bitwise (>>> 1 equals /2)
//        int res = data >> 1; // double shift bitwise (>> 1 equals /2)

        System.out.println(res);
    }
}
