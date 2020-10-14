import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (a * h / 2.00);

        System.out.println(String.format("%.2f", area));

    }
}
