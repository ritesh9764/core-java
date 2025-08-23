import java.util.Scanner;

	public class CuboidCalculeter{

	public static void main(String[] args){

	double l,b,h ;

	Scanner sc = new Scanner(System.in);

	System.out.println("enter lenth : ");
	l = sc.nextDouble();

	System.out.println("enter breadth :");
	b = sc.nextDouble();

	System.out.println("enter height :");
	h = sc.nextDouble();

	double surfacearea = 2 * (l*b+l*h+b*h);

	 double volume = l*b*h; 

	System.out.println("Surface Area of Cuboid :"+surfacearea);
	System.out.println("vcalume of Cuboid :"+ volume);

}
}