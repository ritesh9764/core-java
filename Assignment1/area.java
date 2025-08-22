import java.util.Scanner;

	public class Area{

	public static void main(String[] args){

	double radius,area,circumference;

	Scanner input = new Scanner(System.in);

	System.out.println("enter radius of circle :");
	Double r =
	 input.nextDouble();

	 area = Math.PI * r * r ;
	  circumference = 2 * Math.PI * r;

	System.out.println("area of circle is :"+area);
	
	System.out.println("circumference of circle :"+circumference);
}
}