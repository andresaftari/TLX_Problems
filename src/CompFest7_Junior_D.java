import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CompFest7_Junior_D {
    private final int a;
    private final int b;
    private final int c;

    public CompFest7_Junior_D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<CompFest7_Junior_D> list = new ArrayList<>();

        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                int c = Integer.parseInt(st1.nextToken());

                list.add(new CompFest7_Junior_D(a, b, c));
            }

            list.forEach(it -> {
                if (it.getA() > 0 && it.getB() > 0 && it.getC() > 0) {
                    if (it.getA() == it.getB())
                        System.out.println("segitiga sama kaki");
                    else if (it.getA() * it.getA() + it.getB() * it.getB() == it.getC() * it.getC())
                        System.out.println("segitiga siku-siku");
                    else if (it.getC() < it.getA() || it.getC() < it.getB())
                        System.out.println("bukan segitiga");
                    else
                        System.out.println("segitiga sembarang");
                } else if (it.getA() > 0) if (it.getB() == 0 || it.getC() == 0)
                    System.out.println("garis lurus");
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}