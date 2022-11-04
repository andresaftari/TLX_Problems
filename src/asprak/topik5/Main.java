package asprak.topik5;

public class Main {
    public static void main(String[] args) {
        Departemen dept = new Departemen("Eksternal");

        Kontrak kontrak = new Kontrak("Nisa", 6, 2000000);
        Tetap tetap = new Tetap("Yoga", 5000000, 2000000);
        dept.addKaryawan(kontrak);
        dept.addKaryawan(tetap);

        System.out.println("Menampilkan semua: ");
        dept.displayAll();

        System.out.println("\nMenampilkan kontrak: ");
        dept.displayKontrak();

        System.out.println("\nMenampilkan tetap: ");
        dept.displayTetap();
    }
}
