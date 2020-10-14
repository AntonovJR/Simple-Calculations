import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        double percent = scanner.nextDouble();

        int capacity = length * width * height;
        double liters = capacity * 0.001;
        double lost = percent * 0.01;
        double need = liters * (1 - lost);
        System.out.printf("%.3f", need);

    }
}
