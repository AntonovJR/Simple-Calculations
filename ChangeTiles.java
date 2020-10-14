import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthField = Double.parseDouble(scanner.nextLine());
        double widthTiles = Double.parseDouble(scanner.nextLine());
        double lengthTiles = Double.parseDouble(scanner.nextLine());
        double widthBench = Double.parseDouble(scanner.nextLine());
        double lengthBench = Double.parseDouble(scanner.nextLine());

        double areaField = lengthField * lengthField;
        double areaTiles = widthTiles * lengthTiles;
        double areaBench = widthBench * lengthBench;

        double realArea = areaField - areaBench;
        double amountTiles = realArea / areaTiles;

        double workTime = amountTiles * 0.2;

        System.out.println(amountTiles);
        System.out.println(workTime);


    }
}
