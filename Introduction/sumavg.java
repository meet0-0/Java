import java.util.Scanner;

public class sumavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        double average = sum / 5.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
