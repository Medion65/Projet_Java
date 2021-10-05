package fr.banque;

public class Main {

    public static void main(String[] args) {
        Compte compte = new Compte();
        compte.setNumero(31865777);
        compte.setSolde(50);
        compte.ajouter(2.85);
        System.out.println(compte.toString());
    }
}
