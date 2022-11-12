package asprak.ass24501;

import java.util.ArrayList;

public class Cek {
    public static void main(String[] args) {        
        ArrayList<Test> memberList = new ArrayList<>();

        double saldo1 = 12000.0;
        double saldo2 = 8000.0;
        double saldo3 = 13000.0;
        double saldo4 = 25000.0;
        double saldo5 = 300000.0;
        double saldo6 = 1000.0;
        double saldo7 = 1000000.0;
        
        memberList.add(new Test(saldo1, 123));
        memberList.add(new Test(saldo2, 1234));
        memberList.add(new Test(saldo3, 12345));
        memberList.add(new Test(saldo4, 123456));
        memberList.add(new Test(saldo5, 1234567));
        memberList.add(new Test(saldo6, 12345678));
        memberList.add(new Test(saldo7, 123456789));

        memberList.sort((obj1, obj2) -> {
            if (obj2.getSaldo() > obj1.getSaldo()) {
                return -1;
            } else if (obj1.getSaldo() > obj2.getSaldo()) {
                return 1;
            } else {
                return 0;
            }
        });
        
        for (int i = 0; i < 5; i++) {
            System.out.println(memberList.get(i));
        }
    }
}