package asprak.jurnal3.no2list;

public class Main {
    public static void main(String[] args) {
        Hospital hospital01 = new Hospital("Siloam", 2870);
        Hospital hospital02 = new Hospital("Mayapada", 2878);

        // SAMPE 16:45 OKAY?
        hospital01.setNurse(new Nurse(4000, "Sadri"));
        hospital01.setNurse(new Nurse(2000, "Dionnnnn"));
        hospital02.setNurse(new Nurse(3000, "Nisa"));
        hospital02.setNurse(new Nurse(1000, "Ica"));











        System.out.println("Berikut Data Rumah Sakit Beserta Data Perawat Rumah Sakit Tersebut :");
        display(hospital01);
        display(hospital02);
    }

    private static void display(Hospital hospital) {
        System.out.println("\nNama RS : " + hospital.getNamaRS() + " | ID RS: " + hospital.getIdRS());
        hospital.getNurse().forEach(System.out::println);
    }
}