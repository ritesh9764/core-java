import java.util.Scanner;

    public class ValidTriangle {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("The sides form a VALID Triangle.");
        } else {
            System.out.println("The sides do NOT form a Valid Triangle.");
        }

        
    }
}
