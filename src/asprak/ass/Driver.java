package asprak.ass;

public class Driver extends Member {
    private String platNo, jenisKendaraan;

    public Driver(String id, String nama, String noTelp, String platNo, String jenisKendaraan, double saldo) {
        super(id, nama, noTelp, saldo);
        this.platNo = platNo;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatNo() {
        return platNo;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @Override
    public String toString() {
        return "Member {id=" + super.getId() + ", nama=" + super.getNama() + ", noTelp=" + super.getNoTelp() 
        + ", saldo=" + super.getSaldo() + "}\n" + "Driver {platNo=" + platNo + ", jenisKendaraan=" + jenisKendaraan + "}";
    }
}
