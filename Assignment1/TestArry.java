import java.util.Scanner;

	public class TestArry{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a n :");
	int n = sc.nextInt();

	int[] a = new int[n];
	
	for (int  i=0; i<n; i++)
	a[i] = sc.nextInt();

	System.out.println("GIVEN element over \n");

	for (int x:a)
	System.out.println(x);
}
}

	