import java.util.Scanner;

// LOMBA IDEAFUSE 2014 FINAL CP A
public class IDEAFUSE2014FINAL_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        System.out.println(
                "Think of TPdanJurnal.a number, any number" +
                        "\nMultiply it by " + numA +
                        "\nAdd " + numA * numB + " to your number" +
                        "\nNow, divide your total by " + numA +
                        "\nFinally, subtract the result from the first number you pick" +
                        "\nBRAVO!!!" +
                        "\nYour answer is " + numB
        );
    }
}