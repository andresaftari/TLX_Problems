package asprak.jurnal3.no2array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hospital hospital01 = new Hospital("Siloam", 2870);
        Hospital hospital02 = new Hospital("Mayapada", 2878);

        hospital01.setNurse(new Nurse(4000, "Andre"));
        hospital01.setNurse(new Nurse(4000, "Andzz"));

        hospital02.setNurse(new Nurse(3000, "Dree"));
        hospital02.setNurse(new Nurse(3000, "Thwee"));

        System.out.println("Berikut Data Rumah Sakit Beserta Data Perawat Rumah Sakit Tersebut :");
        display(hospital01);
        display(hospital02);
    }

    private static void display(Hospital hospital) {
        System.out.println("\nNama RS : " + hospital.getNamaRS() + " | ID RS: " + hospital.getIdRS());
        Arrays.stream(hospital.getNurse()).forEach(System.out::println);
    }
}