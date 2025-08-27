import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

                int max1;
        if (a >= b && a >= c) {
            max1 = a;
        } else if (b >= c) {
            max1 = b;
        } else {
            max1 = c;
        }
        System.out.println("Maximum using if-else: " + max1);

                int max2 = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        System.out.println("Maximum using Conditional Operator: " + max2);

               int max3 = Math.max(a, Math.max(b, c));
        System.out.println("Maximum using Math.max: " + max3);

                int max4 = a;
        if (b > max4) max4 = b;
        if (c > max4) max4 = c;
        System.out.println("Maximum using Temp Variable: " + max4);

        sc.close();
    }
}
