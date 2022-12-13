package asprak.ass;

public class Member {
    private String id, nama, noTelp;
    private double saldo;
    
    public Member(String id, String nama, String noTelp, double saldo) {
        this.id = id;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Member {id=" + id + ", nama=" + nama + ", noTelp=" + noTelp + ", saldo=" + saldo + "}";
    }
}
