import java.util.Scanner;

	public class SalesDiscount{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter  Quantity of item1");
		int q1=sc.nextInt();

		System.out.println("Enter the rate of item1");
		double r1=sc.nextDouble();

		System.out.println("Enter  Quantity of item2");
		int q2=sc.nextInt();

		System.out.println("Enter the rate of item2");
		double r2=sc.nextDouble();

		System.out.println("Enter  Quantity of item3");
		int q3=sc.nextInt();

		System.out.println("Enter the rate of item3");
		double r3=sc.nextDouble();

		double total=(q1 *r1) +(q2 * r2)+(q3 *r3);

		double discount=0;
		if(total > 20000){
			discount=total *0.20;
		}
		else if(total > 15000){
			discount=total *0.15;
		}
		 else if(total > 8000){
			discount=total *0.08;
		}

		double netAmount =total -discount;
		
		System.out.println("Total :"+total);

		System.out.println("Discount :"+discount);

		System.out.println("NetAmount :"+netAmount);
	}
}






  