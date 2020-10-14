import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num = scanner.nextInt();
        int hours = num * 3;
        System.out.print("The architect " + name + " will need " + hours + " hours to complete " + num + " project/s.");
    }

}
