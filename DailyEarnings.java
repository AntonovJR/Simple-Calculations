import java.util.Scanner;

public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double workDays = Double.parseDouble(scanner.nextLine());
        double earn = Double.parseDouble(scanner.nextLine());
        double usdToBgn = Double.parseDouble(scanner.nextLine());

        double earnMonth = workDays * earn;
        double earnYear = (earnMonth * 12) + (earnMonth * 2.5);
        double taxes = 0.25 * earnYear;
        double realEarn = earnYear - taxes;
        double leva = realEarn * usdToBgn;
        double earnDay = leva / 365;
        System.out.println(String.format("%.2f", earnDay));


    }
}
