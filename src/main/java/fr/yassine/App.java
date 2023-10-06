package fr.yassine;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double salaireDeBase = 400;

        double primePotentielle = 250;

        System.out.println("Veuillez saisir votre nombre de ventes :");
        int nbDeVentes = clavier.nextInt();
        clavier.close();
        double salaireFinal = salaireDeBase;

        if (nbDeVentes > 10) {
            salaireFinal = salaireDeBase + primePotentielle;
        }

        System.out.println("le salaire est de " + salaireFinal + " euros ");
    }

}