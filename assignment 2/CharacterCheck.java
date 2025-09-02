import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        int asciiValue = (int) ch;

        if (asciiValue >= 48 && asciiValue <= 57)
        {
            System.out.println(ch + " is a Digit.");
        } else if (asciiValue >= 97 && asciiValue <= 122)
        {
            System.out.println(ch + " is a Lowercase alphabet.");
        } else if (asciiValue >= 65 && asciiValue <= 90) 
        {
            System.out.println(ch + " is an Uppercase alphabet.");
        } else {
            System.out.println(ch + " is neither a digit nor an alphabet.");
        }

        }
}
