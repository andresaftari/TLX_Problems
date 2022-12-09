public class Ha {
    private static int currentSaldo;

    public static void main(String[] args) {
        topUp(500); 
    }

    private static void topUp(int saldo) {
        double bonus = saldo * 0.05;
        currentSaldo = currentSaldo + saldo + (int) bonus;

        System.out.println(currentSaldo);
    }
}