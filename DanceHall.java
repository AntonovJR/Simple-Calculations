import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double size = scanner.nextDouble();

        double area = (length * 100) * (width * 100);
        double wardrobeArea = (size * 100) * (size * 100);
        double benchArea = area / 10;
        double clearArea = area - (wardrobeArea + benchArea);

        double dancers = clearArea / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancers));


    }
}
