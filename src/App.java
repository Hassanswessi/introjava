import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est le stock initial ? ");
        int stockInitial = scanner.nextInt();

        System.out.print("Quel est le seuil d'alerte ? ");
        int seuilAlerte = scanner.nextInt();

        System.out.print("Combien de jours doit durer la simulation ? ");
        int nombreJours = scanner.nextInt();

        System.out.println();

        int stockActuel = stockInitial;
        boolean simulationEnCours = true;

        for (int jour = 1; jour <= nombreJours; jour++) {
            System.out.println("Jour " + jour);
            System.out.println("------");

            System.out.print("Quantité de produits reçue ? ");
            int quantiteRecue = scanner.nextInt();

            System.out.print("Quantité de produits vendue ? ");
            int quantiteVendue = scanner.nextInt();

            stockActuel = stockActuel + quantiteRecue - quantiteVendue;

            System.out.println("Le stock actuel est de : " + stockActuel);

            if (stockActuel < 0) {
                System.out.println("ERREUR : le stock est négatif. Simulation arrêtée.");
                simulationEnCours = false;
                break;
            } else {

                if (stockActuel <= seuilAlerte) {
                    System.out.println("ATTENTION : le stock est sous le seuil d'alerte !");
                }
            }

            System.out.println();
        }

        if (simulationEnCours) {
            System.out.println("Simulation terminée. Stock final : " + stockActuel + " unités");
        }

        scanner.close();
    }
}