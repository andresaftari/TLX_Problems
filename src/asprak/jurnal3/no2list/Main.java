package asprak.jurnal3.no2list;

public class Main {
    public static void main(String[] args) {
        Hospital hospital01 = new Hospital("Siloam", 2870);
        Hospital hospital02 = new Hospital("Mayapada", 2878);

        hospital01.setNurse(new Nurse(4000, "Angel"));
        hospital02.setNurse(new Nurse(3000, "Alfian"));

        System.out.println("Berikut Data Rumah Sakit Beserta Data Perawat Rumah Sakit Tersebut :");
        display(hospital01);
        display(hospital02);
    }

    private static void display(Hospital hospital) {
        System.out.println("\nNama RS : " + hospital.getNamaRS() + " | ID RS: " + hospital.getIdRS());
        hospital.getNurse().forEach(System.out::println);
    }
}