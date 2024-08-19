import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }

        System.out.println("The greatest number: " + greatest);
    }
}
