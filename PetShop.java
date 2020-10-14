import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ownedDogs = scanner.nextDouble();
        double otherAnimals = scanner.nextDouble();
        double total = (ownedDogs * 2.50) + (otherAnimals * 4.00);
        System.out.printf("%.2f lv.", total);
    }
}
