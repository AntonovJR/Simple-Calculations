import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scanner.nextLine());
        double amountBeer = Double.parseDouble(scanner.nextLine());
        double amountWine = Double.parseDouble(scanner.nextLine());
        double amountRakia = Double.parseDouble(scanner.nextLine());
        double amountWhiskey = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWhiskey / 2;
        double priceWine = priceRakia * 0.6;
        double priceBeer = priceRakia * 0.2;

        double bill = (amountWhiskey * priceWhiskey) + (amountBeer * priceBeer) + (amountRakia * priceRakia) + (amountWine * priceWine);
        System.out.printf("%.2f", bill);

    }
}
