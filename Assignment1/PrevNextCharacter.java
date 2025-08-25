import java.util.Scanner;

public class PrevNextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        char prevChar = (char) (ch - 1);
        char nextChar = (char) (ch + 1);

        System.out.println("The previous character is " + prevChar);
        System.out.println("The next character is " + nextChar);

        sc.close();
    }
}
