import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number of days book is returned late: ");
        int daysLate = scanner.nextInt();

        int fine = 0;

        if (daysLate > 0 && daysLate < 5)
        {
            fine = daysLate * 5;     
        }
         else if (daysLate >= 6 && daysLate <= 10)
        {
            fine = daysLate * 10;    
        } 
        else if (daysLate > 10) 
        {
            fine = daysLate * 15;    
        } else 
        {
            fine = 0; 
        }

        
        System.out.println("Fine to be paid: Rs " + fine);

       }
}
