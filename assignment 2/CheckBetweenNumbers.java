import java.util.Scanner;

    public class CheckBetweenNumbers {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        if ((first >= second && first <= third) || (first >= third && first <= second)) {
            System.out.println( frist +" is between " + second + " and " + third);
        } else {
            System.out.println(frist + " is NOT between " + second + " and " + third);
        }
    }
}
