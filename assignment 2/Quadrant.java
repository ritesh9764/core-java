import java.util.Scanner;
        public class Quadrant{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the X coordinate:");
		int x=sc.nextInt();

		System.out.println("Enter the Y coordinate :");
		int y=sc.nextInt();

		if(x==0 && y==0)
		{
			System.out.println("Point lies at Origin");
		}
		else if(x > 0 && y > 0)
		{
			System.out.println("Point lies at  Quadrant I");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("Point lies at  Quadrant II");
		}
 		else if(x < 0 && y < 0)
		{
			System.out.println("Point lies at  Quadrant III");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("Point lies at  Quadrant IV");
		}
		else if(x==0)
		{
			System.out.println("Point lies on Y-axis");
		}
		else
		{
			System.out.println("Point lies on X-axis");
		}
	}
}