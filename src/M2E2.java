
import java.util.Scanner;

public class M2E2 {
    public static void main(String[] args) {

        String couleur = demanderLettreEtObtenirCouleur();
        if (couleur.equals("connais pas")) {
            System.out.println("Connais pas.");
        } else {
            System.out.println("Vous avez choisi le " + couleur + ".");
        }
    }

    public static String demanderLettreEtObtenirCouleur() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quelle couleur souhaitez-vous ? ");
        String lettre = scanner.nextLine();
        String couleur;
        if (lettre.equalsIgnoreCase("R")) {
            couleur = "rouge";
        } else if (lettre.equalsIgnoreCase("V")) {
            couleur = "vert";
        } else if (lettre.equalsIgnoreCase("B")) {
            couleur = "bleu";
        } else {
            couleur = "connais pas";
        }
        return couleur;
    }
}