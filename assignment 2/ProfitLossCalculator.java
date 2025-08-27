import java.util.Scanner;

    public class ProfitLossCalculator {
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Cost Price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the Selling Price: ");
        double sellingPrice = scanner.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
