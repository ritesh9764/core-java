import java.util.Scanner;

	public class temperature{

	public static void main(String[] args){

	 Float f,c,k;

	Scanner sc = new Scanner(System.in);

	System.out.println("enter tem in fahrenheit :");
	f = sc.nextFloat();

	c = 5.0/9 * (f-32);

	k  = c + 273.15;

	System.out.println(" fahrenheit is :"+f);
	System.out.println(" celcius is :"+c);
	System.out.println(" kelvin is :"+k);

}
}


	