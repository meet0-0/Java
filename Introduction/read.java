import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number < ten billion: ");
        long number = sc.nextLong();

        if (number < 0) {
            number = -number;
        }

        int digits = String.valueOf(number).length();
        System.out.println("Number of digits: " + digits);
    }
}
