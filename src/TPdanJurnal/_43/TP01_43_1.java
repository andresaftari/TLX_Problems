package TPdanJurnal._43;

public class TP01_43_1 {
    public static void main(String[] args) {
        int awal = 150000;
        int pengeluaran1 = 45000;
        int pengeluaran2 = 20000;
        int pengeluaran3 = 55000;
        int pinjam = 200000;

        int total = awal - (pengeluaran1 + pengeluaran2 + pengeluaran3) + pinjam;
        System.out.println(total);
    }
}