import java.util.Scanner;

public class AtmCash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = sc.nextInt();

        int notes10 = amount / 10;
        amount = amount % 10;
        
        int notes5 = amount / 5;
        amount = amount % 5;
        
        int notes1 = amount;

        System.out.println("Number of 10 notes: " + notes10);
        System.out.println("Number of 5 notes: " + notes5);
        System.out.println("Number of 1 notes: " + notes1);

        sc.close();
    }
}
