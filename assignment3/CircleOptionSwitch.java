import java.util.Scanner;
public class CircleOptionSwitch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		float rad=sc.nextFloat();

          
		System.out.println("1->Area Of Circle");
		System.out.println("2->Circumference Of Circle");
		System.out.println("3->Volume Of Sphere");
		System.out.println("4->Exit");
	
		System.out.println("Enter Your choice :");
		int ch=sc.nextInt();
		
		switch(ch){

		case 1 ->{
			double AOC =Math.PI*rad*rad;
			System.out.println("Area of Circle : "+AOC);
			
		}
		case 2 ->{
			double Circumcir=2* Math.PI*rad;
			System.out.println("circumference of Circle :"+Circumcir);
					
		}
		case 3 ->{
			double volume = (4.0 / 3.0) * Math.PI * rad*rad*rad;
			System.out.println("Volume of Sphere :"+volume);
		
		}
		case 4->{
			System.exit(0);
		}
		default->{
			System.out.println("Invalid choice");
		}
	
	}
    }
}

		
		