
import java.util.Scanner;

public class Celsius2Fahrenheit {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (degreesCelsius * 1.8) + 32;
        System.out.printf("%.2f", fahrenheit);

    }
}

