import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for birth month
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        // Validate input
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }

        scanner.close();
    }
}
