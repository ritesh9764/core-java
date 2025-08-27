import java.util.Scanner;

  	public class StudentSubMarks {
    	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the marks for Math:");
        float m1 = sc.nextFloat();

        System.out.println("Enter the marks for Java:");
        float m2 = sc.nextFloat();

        System.out.println("Enter the marks for C:");
        float m3 = sc.nextFloat();

        float total = m1 + m2 + m3;
	double avg= total/3; 

        if (avg >= 90) {
            System.out.println("O Grade (PASS)");
        } else if (avg >= 70) {
            System.out.println("A Grade");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}