import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        int lengthCentimeters = (int) (length * 100);
        int widthCentimeters = (int) (width * 100);
        int cols = (widthCentimeters - 100) / 70;
        int rows = lengthCentimeters / 120;
        int seats = (rows * cols) - 3;
        System.out.println(seats);
    }
}
