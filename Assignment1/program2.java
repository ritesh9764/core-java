import java.util.Scanner;

	public class circumference{
	public static void main(String[] args){

	double r,area,circuference;

	Scanner input = new Scanner(System.in);
		
	System.out.println("ENTER r of circle :");
	
	r = input.nextDouble();

	area = Math.PI * r * r;
	double circumference = 2 * Math.PI * r;

	System.out.println("area of circle is :"+area);
	System.out.println("circumference is :"+circumference);
}
	}
	