package asprak.jurnal3.no2array;

public class Hospital {
    private String namaRS;
    private int idRS;
    private Nurse[] nurses = new Nurse[2];

    public String getNamaRS() {
        return namaRS;
    }

    public int getIdRS() {
        return idRS;
    }

    public Nurse[] getNurse() {
        return nurses;
    }

    public Hospital(String namaRS, int idRS) {
        this.namaRS = namaRS;
        this.idRS = idRS;
    }

    public void setNurse(Nurse nurse) {
        if (nurses[0] == null) {
            nurses[0] = nurse;
        } else {
            nurses[1] = nurse;
        }
    }
}