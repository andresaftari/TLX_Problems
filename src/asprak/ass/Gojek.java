package asprak.ass;

import java.util.ArrayList;

public class Gojek {
    private static ArrayList<Member> mList = new ArrayList<>();

    public static void main(String[] args) {
        new Gojek().runThis();
    }

    public void runThis() {
        addDriver("1", "Becky", "0811", "D 1 A", "Motor", 100000);
        addDriver("2", "Adrian", "0812", "B 15 A", "Motor", 50000);
        addDriver("3", "Begra", "0813", "J 45A LHO", "Motor", 0);
        addDriver("8", "Begra", "0813", "J 45A LHO", "Motor", 0);
        addDriver("9", "Begra", "0813", "J 45A LHO", "Motor", 0);

        addCustomer("4", "Eva", "0814", 100000);
        // addCustomer("5", "Celia", "0815", 0);
        // addCustomer("6", "Latjuba", "0816", 200000);
        // addCustomer("7", "Lesmana", "0817", 0);

        topUpSaldo("1", 150000);
        // topUpSaldo("3", 50000);
        topUpSaldo("4", 250000);
        // topUpSaldo("5", 450000);
        // topUpSaldo("6", 150000);
        // topUpSaldo("9", 150000);

        viewDriver("1");
        // viewDriver("2");
        // viewDriver("3");
        // viewDriver("4");

        // viewCustomer("1");
        viewCustomer("4");
        // viewCustomer("5");
        // viewCustomer("8");

        transaksi("2", "3", 50000);
        // transaksi("3", "5", 50000);
        // transaksi("4", "5", 50000);
        // transaksi("1", "2", 50000);

        top5SaldoTerbanyak();
    }

    public static void addDriver(String id, String nama, String noTelp, String platNo, String jenis, double saldo) {
        Driver driver = new Driver(id, nama, noTelp, platNo, jenis, saldo);

        if (cekId(id) == 1) {
            System.out.println("ID driver sudah ada");
        } else {
            mList.add(driver);
        }
    }

    public static void addCustomer(String id, String nama, String noTelp, double saldo) {
        Customer customer = new Customer(id, nama, noTelp, saldo);

        if (cekId(id) == 1) {
            System.out.println("ID customer sudah ada");
        } else {
            mList.add(customer);
        }
    }

    public static int cekId(String id) {
        boolean isFound = false;

        for (Member member : mList) {
            if (id == member.getId()) {
                isFound = true;
            } else {
                isFound = false;
            }
        }

        if (isFound)
            return 1;
        else
            return 0;
    }

    public static void viewDriver(String id) {
        System.out.println("\n===== VIEW DRIVER =====");

        for (Member member : mList) {
            if (member instanceof Driver) {
                if (member.getId() == id) {
                    System.out.println(member);
                }
            }
        }
    }

    public static void viewCustomer(String id) {
        System.out.println("\n===== VIEW CUSTOMER =====");

        for (Member member : mList) {
            if (member instanceof Customer) {
                if (member.getId() == id) {
                    System.out.println(member);
                }
            }
        }
    }

    public static void topUpSaldo(String id, double saldo) {
        System.out.println("\n===== TOPUP SALDO =====");

        for (Member member : mList) {
            if (member instanceof Customer) {
                if (member.getId() == id) {
                    System.out.println("\nData Awal\n" + member);

                    ((Customer) member).setSaldo(saldo);
                    System.out.println("\nData Akhir\n" + member);
                }
            } else if (member instanceof Driver) {
                if (member.getId() == id) {
                    System.out.println("\nData Awal\n" + member);

                    ((Driver) member).setSaldo(saldo);
                    System.out.println("\nData Akhir\n" + member);
                }
            }
        }
    }

    public static void transaksi(String idDriver, String idCustomer, double tarif) {
        System.out.println("\n===== TRANSAKSI =====");
        double saldo = 0.0;

        for (Member member : mList) {
            if (member instanceof Driver) {
                if (member.getId() == idDriver) {
                    ((Driver) member).setSaldo(saldo + tarif);
                    System.out.println("\nData Driver:\n" + member);
                } else {
                    System.out.println("ID " + idDriver + " bukan driver");
                }
            }

            if (member instanceof Customer) {
                if (member.getId() == idCustomer) {
                    ((Customer) member).setSaldo(saldo - tarif);
                    System.out.println("\nData Customer:\n" + member);
                } else {
                    System.out.println("ID " + idCustomer + " bukan customer");
                }
            }
        }
    }

    public static void top5SaldoTerbanyak() {
        System.out.println("\n===== TOP 5 SALDO TERBANYAK =====");

        mList.sort((obj1, obj2) -> {
            if (obj2.getSaldo() > obj1.getSaldo()) {
                return -1;
            } else if (obj1.getSaldo() > obj2.getSaldo()) {
                return 1;
            } else {
                return 0;
            }
        });

        

        if (mList.size() < 5) {
            System.out.println("Data hanya ada " + mList.size());
        } else {
            for (int i = 5; i >= 0; i--) {
                System.out.println(mList.get(i));
            }
        }
    }
}
