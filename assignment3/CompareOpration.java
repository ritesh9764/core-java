import java.util.Scanner;

public class CompareOpration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1->Equality");
        System.out.println("2->Less Than");
        System.out.println("3->Quotient and Remainder");
        System.out.println("4->Range");
        System.out.println("5->Swap");

        System.out.print("Enter your Choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter the First Number (X): ");
        int x = sc.nextInt();

        System.out.print("Enter the Second Number (Y): ");
        int y = sc.nextInt();

        switch (ch) {
            case 1 -> {
                if (x == y)
                    System.out.println("Both are same (x & y) are equal");
                else
                    System.out.println("Not equals");
            }

            case 2 -> {
                if (x < y)
                    System.out.println("x is less than y");
                else
                    System.out.println("x is not less than y");
            }

            case 3 -> {
                if (y != 0) {
                    System.out.println("Quotient is: " + (x / y));
                    System.out.println("Remainder is: " + (x % y));
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }

            case 4 -> {
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                if ((num >= x && num <= y) || (num >= y && num <= x))
                    System.out.println(num + " lies between " + x + " and " + y);
                else
                    System.out.println(num + " does not lie between " + x + " and " + y);
            }

            case 5 -> {
                int temp = x;
                x = y;
                y = temp;
                System.out.println("Values swapped: x = " + x + ", y = " + y);
            }

            default -> System.out.println("Wrong Choice");
        }

    }
}