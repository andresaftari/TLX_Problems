package asprak.jurnal3.no2list;

import java.util.ArrayList;

public class Hospital {
    private String namaRS;
    private int idRS;
    private ArrayList<Nurse> nurses = new ArrayList<>();

    public Hospital(String namaRS, int idRS) {
        this.namaRS = namaRS;
        this.idRS = idRS;
    }

    public String getNamaRS() {
        return namaRS;
    }

    public int getIdRS() {
        return idRS;
    }

    public ArrayList<Nurse> getNurse() {
        return nurses;
    }

    public void setNurse(Nurse nurse) {
        nurses.add(nurse);
    }
}
