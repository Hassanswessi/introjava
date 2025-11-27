
public class M4ECombatRPG {

    public static void main(String[] args) {
        afficherBienvenue();
        afficherNom();
        afficherCaracteristiques();
    }

    public static void afficherBienvenue() {
        System.out.println("Bienvenue ");
    }

    public static void afficherNom() {
        System.out.println("lucas hochar");
    }

    public static void afficherCaracteristiques() {
        String nom = "lucas hochar";
        int force = 20;
        int agilite = 87;
        int pointsDeVie = 99;

        System.out.println("Caractéristiques du combattant");
        System.out.println("Nom : " + nom);
        System.out.println("Force : " + force);
        System.out.println("Agilité : " + agilite);
        System.out.println("Points de vie : " + pointsDeVie);
    }

}
