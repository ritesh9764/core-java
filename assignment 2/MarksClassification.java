import java.util.Scanner;

public class MarksClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        double total = subject1 + subject2 + subject3;
        double average = total / 3;

        System.out.println("Total marks secured: " + total);
        System.out.println("Average marks: " + average);

        if (average > 75) {
            System.out.println("Class obtained: Class I");
        } else if (average >= 60 && average <= 75) {
            System.out.println("Class obtained: Class II");
        } else if (average >= 40 && average < 60) {
            System.out.println("Class obtained: Pass Class");
        } else {
            System.out.println("Class obtained: Fail");
        }

        
    }
}
