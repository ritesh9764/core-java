import java.util.Scanner;
public class Daysofweak{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your (1 - 7 ) WeekDays ");
		int days=sc.nextInt();

		switch(days){
			case 1->{
			    System.out.println("Monday");
				}
			case 2->{
			    System.out.println("Tuesday");
				}
			case 3->{
			    System.out.println("wednesday");
				}
			case 4->{
			    System.out.println("Thursday");
				}
			case 5->{
			    System.out.println("Friday");
				}
			case 6->{
			    System.out.println("Saturday");
				}
			case 7->{
			    System.out.println("Sunday");
				}
			default->{
			    System.out.println("Invalid choice");
				}
		}
	}
}