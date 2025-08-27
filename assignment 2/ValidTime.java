import java.util.Scanner;

        public class ValidTime{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the hours");
		int hours=sc.nextInt();

		System.out.println("Enter the Minute");
		int minute=sc.nextInt();

		System.out.println("Enter the Second");
		int sec=sc.nextInt();

		if(hours>=0 && hours<=24 && minute>=0 && minute<=60 && sec>=0 && sec<=60)
		{
			System.out.println("valid time" +hours+ " : " +minute+ " : " +sec);
		}
		else 
		{
			System.out.println("Invalid Time");
		}
	}
} 