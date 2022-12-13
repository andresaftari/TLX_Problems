package asprak;

public class Pulpen {
    private String warna, ukuran; // variable global
    private final int panjang; // variable final

    public Pulpen(String warna, String ukuran) {
        this.warna = warna;
        this.ukuran = ukuran;
        this.panjang = 20;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}

class MainPulpen {
    public static void main(String[] args) {
        Pulpen p1 = new Pulpen("Merah", "0.5");


    }
}
