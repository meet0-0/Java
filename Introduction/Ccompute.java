import java.util.Scanner;

public class Ccompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = sc.nextInt();

        int nn = Integer.parseInt(n + "" + n);
        int nnn = Integer.parseInt(n + "" + n + "" + n);

        int result = n + nn + nnn;

        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
    }
}
