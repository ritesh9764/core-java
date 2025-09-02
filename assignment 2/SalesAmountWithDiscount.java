import java.util.Scanner;

public class SalesAmountWithDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount = 0;

                for (int i = 1; i <= 3; i++) {
            System.out.print("Enter quantity for item " + i + ": ");
            int quantity = scanner.nextInt();
            System.out.print("Enter rate for item " + i + ": ");
            double rate = scanner.nextDouble();

            totalAmount += quantity * rate;
        }

                System.out.println("Total sales amount: " + totalAmount);

        double discount = 0;

        if (totalAmount > 1000) {
            discount = 0.20 * totalAmount;  
        }
        else if (totalAmount >= 500 && totalAmount <= 1000) {
            discount = 0.15 * totalAmount;  
        }
        else if (totalAmount >= 200 && totalAmount < 500) {
            discount = 0.08 * totalAmount;  
        }
        else {
            discount = 0;
        }

        System.out.println("Discount: " + discount);

        System.out.println("Net amount after discount: " + (totalAmount - discount));

        }
}
