import java.util.Scanner;

public class MotionCalculater {

    public static void main(String[] args) {

        double u, a, t;  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial velocity (u):");
        u = sc.nextDouble();

        System.out.println("Enter acceleration (a):");
        a = sc.nextDouble();

        System.out.println("Enter time (t):");
        t = sc.nextDouble();

        double v = u + a * t;                     	
        double s = u * t + 0.5 * a * t * t;       

        System.out.println("Final velocity (v): " + v);
        System.out.println("Distance traveled (s): " + s);

        
    }
}
