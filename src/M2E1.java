
import java.util.Scanner;

public class M2E1 {
    public static void main(String[] args) {
        System.out.print("demander Entier Et Afficher Parite ");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }
        scanner.close();
    }
}