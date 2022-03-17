package TPdanJurnal._43;

public class TP01_43_3 {
    public static void main(String[] args) {
        int totalHarga = 6500000;

        // Cicilan
        int jan = 500000;
        int feb = 750000;
        int mar = 600000;
        int apr = 700000;

        int totalCicilan = jan + feb + mar + apr;
        System.out.println(totalHarga - totalCicilan);
    }
}