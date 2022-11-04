package asprak.kelas4504.topik5;

public class Main {
    public static void main(String[] args) {
        Departemen dept = new Departemen("Ibis");
        
        Kontrak kontrak = new Kontrak("Sinyo", 5000, 1);
        Tetap tetap = new Tetap("Rangga", 5000, 10000);
        
        dept.addKaryawan(kontrak);
        dept.addKaryawan(tetap);
        
//        System.out.println("Nampilin semua");
        dept.displayAll();
        System.out.println();
        
//        System.out.println("Nampilin kontrak");
        dept.displayKontrak();
        
//        System.out.println("Nampilin tetap");
        dept.displayTetap();
    }
}
