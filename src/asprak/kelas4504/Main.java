package asprak.kelas4504;

public class Main {
    public static void main(String[] args) {
        checkObj(new Car("ha", "ho"));
    }

    private static void checkObj(Car car) {
        if (car != null) {
            if (car instanceof Vehicle) {
                System.out.println("yeay");
            }
        }
    }
}
