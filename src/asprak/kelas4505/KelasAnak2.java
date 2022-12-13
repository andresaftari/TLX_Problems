package asprak.kelas4505;

public class KelasAnak2 extends KelasInduk {
    private String privilej;

    public KelasAnak2(String nama, String privilej) {
        super(nama);
        this.privilej = privilej;
    }

    public String getPrivilej() {
        return privilej;
    }

    @Override
    public void display() {
        System.out.println("ini anak 2 punya " + privilej);
    }
}
