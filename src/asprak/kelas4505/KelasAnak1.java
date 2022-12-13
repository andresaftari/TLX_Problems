package asprak.kelas4505;

public class KelasAnak1 extends KelasInduk  {
    private String warna;

    public KelasAnak1(String nama, String warna) {
        super(nama);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public void display() {
        System.out.println("ini anak 1 punya " + warna);
    }
}
