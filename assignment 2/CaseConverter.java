import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        char convertedChar;

         if (ch >= 'a' && ch <= 'z')
        {
            convertedChar = (char)(ch - 'a' + 'A');  
        }
         else if (ch >= 'A' && ch <= 'Z')
        {
            convertedChar = (char)(ch - 'A' + 'a');     
       }
        else {
            System.out.println("Input is not an alphabet character.");
            scanner.close();
            return;
        }

        System.out.println("Converted character: " + convertedChar);

       }
}
