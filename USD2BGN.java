
import java.util.Scanner;

public class USD2BGN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BGN = Double.parseDouble(scanner.nextLine());
        double USD = BGN * 1.79549;

        System.out.println(String.format("%.2f", USD));

    }
}
