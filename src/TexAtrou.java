import java.util.Scanner;

import java.util.Scanner;

public class TexAtrou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les entrées à l'utilisateur
        System.out.print("Entrez un premier nom commun : ");
        String nom1 = scanner.next();

        System.out.print("Entrez un nombre : ");
        String nombre = scanner.next();

        System.out.print("Entrez un deuxième nom commun : ");
        String nom2 = scanner.next();

        System.out.print("Entrez un adjectif : ");
        String adjectif = scanner.next();

        // Afficher le résultat
        System.out.print("Il était une fois un " + nom1 + " qui avait " + nombre + " " + nom2
                + ". Cela le rendait très " + adjectif + ".");

        scanner.close();
    }
}