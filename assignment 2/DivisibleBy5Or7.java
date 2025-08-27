import java.util.Scanner;

public class DivisibleBy5Or7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7.");
        } else {
            System.out.println(num + " is not divisible by 5 or 7.");
        }

        sc.close();
    }
}
