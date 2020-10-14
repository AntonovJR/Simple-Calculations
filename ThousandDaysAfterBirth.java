import java.util.Scanner;
import java.time.format.*;
import java.time.LocalDate;

public class ThousandDaysAfterBirth {
    private static Object StringValueExp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String textDate = scanner.nextLine();
        LocalDate ParsedDate = LocalDate.parse(textDate, formatter);
        LocalDate After1000 = ParsedDate.plusDays(1000);
        System.out.printf("%1$td-%1$tm-%1$tY", After1000);
    }
}
