import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0, spaces = 0, digits = 0, others = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Digits: " + digits);
        System.out.println("Other characters: " + others);
    }
}
