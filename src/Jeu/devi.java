package Jeu;

import java.util.Random;
import java.util.Scanner;

public class devi {
	public static void main(String[] args) {
        
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(100) + 1; 
        int essaisRestants = 10; 
        boolean gagne = false; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue au jeu de devinettes!");
        System.out.println("Je pense à un nombre entre 1 et 100.");
        System.out.println("Pouvez-vous deviner ce nombre? Vous avez 10 essais.");

        
        while (essaisRestants > 0) {
            System.out.println("Il vous reste " + essaisRestants + " essais.");
            System.out.print("Entrez votre devinette: ");
            int devinette = scanner.nextInt();

            
            if (devinette == nombreAleatoire) {
                gagne = true;
                break;
            } else if (devinette < nombreAleatoire) {
                System.out.println("Votre devinette est trop basse.");
            } else {
                System.out.println("Votre devinette est trop élevée.");
            }

            essaisRestants--;
        }

        
        if (gagne) {
            System.out.println("Félicitations! Vous avez deviné le bon nombre.");
        } else {
            System.out.println("Désolé, vous avez épuisé tous vos essais. Le nombre était " + nombreAleatoire + ".");
        }

        scanner.close();
    }
}
