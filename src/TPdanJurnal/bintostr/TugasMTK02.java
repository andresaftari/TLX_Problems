package TPdanJurnal.bintostr;

import java.util.ArrayList;

class TugasMTK02 {
    public static void main(String[] args) {
        String coba = "";
        ArrayList<String> list = new ArrayList<>();
        int con = 1;
        list.add("");

        do {
            for (int i = 1; i <= 5; i++) {
                int random = (int) (Math.random() * 2);
                coba += Integer.toString(random);
            }
            for (int j = 0; j < list.size(); j++) {
                if (coba.equalsIgnoreCase(list.get(j))) {
                    j = list.size();
                    con = 0;
                } else {
                    con = 1;
                }
            }
            if (con == 1) {
                list.add(coba);
            }
            coba = "";
        } while (list.size() != 33);
        list.remove(0);

        for (int l = 0; l < list.size(); l++) {
            System.out.print(list.get(l) + " ");
        }
    }
}