package fr.banque;

public class Compte {
    private int numero;
    private double solde;

    public Compte() {
    }

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }



    public void ajouter(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        this.solde -= montant;
    }

    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            return false;
        }
    }
}
