import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual basic salary: ");
        double salary = sc.nextDouble();
        double tax;

        if (salary < 150000) {
            tax = 0;
        } else if (salary <= 300000) {
            tax = salary * 0.20; 
        } else {
            tax = salary * 0.30; 
        }
        System.out.println("Income Tax = ₹" + tax);
    }
}
