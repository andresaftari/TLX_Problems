package asprak.kelas4504;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand;
    }
}
