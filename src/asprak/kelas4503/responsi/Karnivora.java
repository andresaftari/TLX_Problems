package asprak.kelas4503.responsi;

public class Karnivora extends Hewan {
    private String namaHewan;

    public Karnivora(String habitat, String namaHewan) {
        super(habitat);
        this.namaHewan = namaHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }
    
    public void display() {
        System.out.println("Nama Hewannya di " + super.habitat 
                + " - Nama hewannya " + this.namaHewan);
    }
}
