import java.util.Scanner;

public class Radians2Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 57.29;


        System.out.printf("%.0f", deg);

    }
}


