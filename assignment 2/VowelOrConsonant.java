import java.util.Scanner;

    public class VowelOrConsonant {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase character: ");
        char ch = sc.next().charAt(0); 

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a lowercase alphabet.");
        }
    }
}
