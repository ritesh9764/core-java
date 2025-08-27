import java.util.Scanner;

	public class LibraryFine{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number of Days late");
		int days=sc.nextInt();

		int fine;
		if( days < 5)
		{
			fine= 1 * days;
		}
		else if(days <= 10)
		{
			fine=5 * days;
		}
		else
		{
			fine=10 * days;
		}
			System.out.println("Fine = Rs." +fine);
	}
}