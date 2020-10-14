import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        double kilogramVegetables = Double.parseDouble(scanner.nextLine());
        double kilogramFruits = Double.parseDouble(scanner.nextLine());

        double totalPriceVegetables = (priceVegetables * kilogramVegetables);
        double totalPriceFruits = (priceFruits * kilogramFruits);
        double total = ((totalPriceFruits + totalPriceVegetables) / 1.94);
        System.out.println(total);
    }
}
