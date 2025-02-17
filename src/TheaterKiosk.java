import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if eligible for a wristband
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }

        scanner.close();
    }
}