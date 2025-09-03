import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single digit (0-9): ");
        int n = sc.nextInt();

        if (n < 0 || n > 9) {
            System.out.println("Invalid input. Please enter a single digit (0-9).");
        } else {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println(words[n]);
        }
    }
}
