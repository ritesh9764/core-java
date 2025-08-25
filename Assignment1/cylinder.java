import java.util.Scanner;

	public class cylinder{

	public static void main(String[] args){
	
	double radius,height;
	
	Scanner sc = new Scanner(System.in);

	System.out.println("ENTER radius of cylinder : ");
	radius = sc.nextDouble();

	System.out.println("ENTER height of cylinder :");
	height = sc.nextDouble();

	double Tsurfacearea  = 2 * Math.PI * radius * (radius + height);

	double Csurfacearea = 2 * Math.PI * radius * radius * height ;

	double Volume = Math.PI * radius * radius * height ;

	System.out.println("surfacearea of cylinder :"+ Csurfacearea);
	System.out.println("total surface area of cylinder :"+Tsurfacearea);
	System.out.println("volume of cylinder is :"+Volume);

	}
}
	
