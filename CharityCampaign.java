import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days = scanner.nextDouble();
        double cookers = scanner.nextDouble();
        double cakes = scanner.nextDouble();
        double waffles = scanner.nextDouble();
        double pancakes = scanner.nextDouble();

        double moneyCakes = (days * cookers * cakes) * 45;
        double moneyWaffles = (days * cookers * waffles) * 5.80;
        double moneyPancakes = (days * cookers * pancakes) * 3.2;
        double totalMoney = moneyWaffles + moneyPancakes + moneyCakes;
        double taxes = totalMoney * 0.125;
        double profit = totalMoney - taxes;

        System.out.printf("%.2f", profit);


    }
}
