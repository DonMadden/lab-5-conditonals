import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Select your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D, R, I): ");

        // Get user input
        char choice = scanner.next().toUpperCase().charAt(0);

        // Determine affiliation
        if (choice == 'D') {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice == 'R') {
            System.out.println("You get a Republican Elephant.");
        } else if (choice == 'I') {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        scanner.close();
    }
}