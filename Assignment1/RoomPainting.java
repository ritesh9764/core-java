import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input room dimensions
        System.out.print("Enter room length: ");
        double length = sc.nextDouble();

        System.out.print("Enter room breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter room height: ");
        double height = sc.nextDouble();

        // Input door dimensions
        System.out.print("Enter door height: ");
        double doorHeight = sc.nextDouble();

        System.out.print("Enter door width: ");
        double doorWidth = sc.nextDouble();

        // Input window dimensions (both windows same size)
        System.out.print("Enter window height: ");
        double windowHeight = sc.nextDouble();

        System.out.print("Enter window width: ");
        double windowWidth = sc.nextDouble();

        // Calculate total wall area (2 * height * (length + breadth))
        double wallArea = 2 * height * (length + breadth);

        // Calculate door area
        double doorArea = doorHeight * doorWidth;

        // Calculate total window area (2 windows)
        double windowArea = 2 * (windowHeight * windowWidth);

        // Calculate area to be painted
        double paintArea = wallArea - doorArea - windowArea;

        // Calculate roof area to be whitewashed
        double whitewashArea = length * breadth;

        // Display results
        System.out.println("Area to be painted (walls): " + paintArea);
        System.out.println("Area to be whitewashed (roof): " + whitewashArea);

        sc.close();
    }
}