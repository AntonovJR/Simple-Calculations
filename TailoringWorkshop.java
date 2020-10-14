import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();
        double lengthTable = scanner.nextDouble();
        double widthTable = scanner.nextDouble();

        double cloth = (lengthTable + 0.6) * (widthTable + 0.6);
        double square = (lengthTable / 2) * (lengthTable / 2);
        double clothQuantity = cloth * quantity;
        double squareQuantity = square * quantity;
        double sizeMaterial = clothQuantity * 7 + squareQuantity * 9;
        System.out.printf("%.2f USD", sizeMaterial);
        System.out.printf("%n");
        System.out.printf("%.2f BGN", (sizeMaterial * 1.85));
    }
}
