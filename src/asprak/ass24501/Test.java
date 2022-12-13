package asprak.ass24501;

public class Test {
    private double saldo;
    private int no;

    public Test(double saldo, int no) {
        this.saldo = saldo;
        this.no = no;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNo() {
        return no;
    }   

    @Override
    public String toString() {
        return "Saldo: " + getSaldo();
    }
}
