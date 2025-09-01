import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room length: ");
        double length = sc.nextDouble();

        System.out.print("Enter room breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter room height: ");
        double height = sc.nextDouble();

        System.out.print("Enter door height: ");
        double doorHeight = sc.nextDouble();

        System.out.print("Enter door width: ");
        double doorWidth = sc.nextDouble();

        System.out.print("Enter window height: ");
        double windowHeight = sc.nextDouble();

        System.out.print("Enter window width: ");
        double windowWidth = sc.nextDouble();
        double wallArea = 2 * height * (length + breadth);

        double doorArea = doorHeight * doorWidth;
        double windowArea = 2 * (windowHeight * windowWidth);
        double paintArea = wallArea - doorArea - windowArea;

        double whitewashArea = length * breadth;

        System.out.println("Area to be painted (walls): " + paintArea);
        System.out.println("Area to be whitewashed (roof): " + whitewashArea);

    
    }
}