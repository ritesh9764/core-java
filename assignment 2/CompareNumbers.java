import java.util.Scanner;

    public class CompareNumbers {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " is EQUAL to " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is GREATER than " + num2);
        } else {
            System.out.println(num1 + " is LESS than " + num2);
        }

        
    }
}
