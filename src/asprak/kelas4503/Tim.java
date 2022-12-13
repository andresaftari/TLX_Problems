package asprak.kelas4503;

import java.util.ArrayList;

public class Tim {
    private String nama;
    private ArrayList<Member> m = new ArrayList<>();

    public void setMember(Member member) {
        m.add(member);
    }

    public void displayFullMember() {    
        for (Member member : m) {
            if (!(member instanceof Trainee)) {
                if (member != null) 
                    member.display();
            }
        }
    }

    public void displayTrainee() {
        for (Member member : m) {
            if (member instanceof Trainee) {
                member.display();
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
