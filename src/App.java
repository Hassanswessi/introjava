import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Réupérer le nombre d'heure travaillées

        // Initialisation du scanner pour le clavier
        Scanner clavier = new java.util.Scanner(System.in);
        // nextInt attend une entrée au clavier
        System.out.print("Combien d'heures avez-vous travaillées cette semaine ? ");
        int heuresTravaillees = clavier.nextInt();

        // Réc
        System.out.println("entrez le taux horaire : ");
        double tauxHoraire = clavier.nextDouble();

        // on "ferme" la ressource clavier
        clavier.close();

        // multiplier le nombre d'heures travaillées par le taux horaire
        double salairebrut = heuresTravaillees * tauxHoraire;

        // afficher le résultat
        System.out.println("le salaire brut est de " + salairebrut);
    }
}
