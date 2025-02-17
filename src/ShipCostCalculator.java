import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get item price from user
        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        // Calculate shipping cost
        double shippingCost = (price >= 100) ? 0 : price * 0.02;
        double totalPrice = price + shippingCost;

        // Output results
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total cost: $" + totalPrice);

        scanner.close();
    }
}