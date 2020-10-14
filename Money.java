import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitcoin = Double.parseDouble(scanner.nextLine());
        double iuan = Double.parseDouble(scanner.nextLine());
        double taxes = Double.parseDouble(scanner.nextLine());

        double leva = bitcoin * 1168;
        double usd = iuan * 0.15;
        double usdToLev = usd * 1.76;
        double commission = taxes / 100;

        double total = (usdToLev + leva) / 1.95;
        double tax = total * commission;


        System.out.println(total - tax);

    }
}
