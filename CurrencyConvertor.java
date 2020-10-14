import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConvertor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String fromCurrency = scanner.nextLine();
        String toCurrency = scanner.nextLine();

        DecimalFormat f = new DecimalFormat("##.##");


        // For amounts Conversion
        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("BGN")) {
                double newAmount = amount * 1.79549;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("EUR")) {
                double newAmount = amount * 0.91801;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("GBP")) {
                double newAmount = amount * 0.70854;
                System.out.println(String.format("%.2f", newAmount));
            }
        }

        if (fromCurrency.equals("BGN")) {
            if (toCurrency.equals("USD")) {
                double newAmount = amount / 1.79549;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("EUR")) {
                double newAmount = amount / 1.95583;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("GBP")) {
                double newAmount = amount / 2.53405;
                System.out.println(String.format("%.2f", newAmount));
            }
        }
        if (fromCurrency.equals("EUR")) {
            if (toCurrency.equals("BGN")) {
                double newAmount = amount * 1.95583;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("USD")) {
                double newAmount = amount * 1.08930;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("GBP")) {
                double newAmount = amount * 0.77181;
                System.out.println(String.format("%.2f", newAmount));
            }
        }
        if (fromCurrency.equals("GBP")) {
            if (toCurrency.equals("BGN")) {
                double newAmount = amount * 2.53405;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("USD")) {
                double newAmount = amount / 0.70854;
                System.out.println(String.format("%.2f", newAmount));
            } else if (toCurrency.equals("EUR")) {
                double newAmount = amount / 0.77181;
                System.out.println(String.format("%.2f", newAmount));
            }
        }


    }

}