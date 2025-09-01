import java.util.Scanner;
public class StudentClassFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 60) {
            System.out.println("Class: First");
        } else if (average >= 50) {
            System.out.println("Class: Second");
        } else if (average >= 35) {
            System.out.println("Class: Pass");
        } else {
            System.out.println("Class: Fail");
        }
    }
}
