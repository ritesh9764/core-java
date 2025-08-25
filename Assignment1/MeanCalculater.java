import java.util.Scanner;

	public class MeanCalculater{
	public static void main(String[]in){

	double a,b;

	Scanner sc = new Scanner(System.in);

	System.out.println("enter frist number :");
	a = sc.nextDouble();

	System.out.println("enter second number :");
	b  = sc.nextDouble();

	double am = (a+b)/2;
	
	double hm =(2 * a *b) /(a+b);

	System.out.println("Arithmetic mean :"+am);
	System.out.println("Harmonic mean :"+hm);
}
}

