

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public abstract class LibrairyAbstract {
	
// déclaration des variables d'instances utiles à toutes les classes
	
int nbChiffre;
int nbEssai;
int securityLoop; //permet de sortir des boucles en cas d'erreur de saisie

int selectGame;	
int selectMode;

int userInput;




//pour faire évoluer la méthode Random
int min = 0;
int max = 0;




// Méthodes communes aux autres classes ---------------------------------------------------------------------------------------------------------------

//Le Menu : 


public void Menu() {
// choix du jeux----------------------------------------------------------------------------------------------------------------------------------------
	int securityLoop  = 0;
	do{ // boucle en cas d'erreur de saisie
	try {
	securityLoop =0;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("A quel jeu souhaitez vous jouer");	
	System.out.println("1. Plus ou Moins");
	System.out.println("2. Mastermind");

	selectGame = sc.nextInt();
	this.selectGame = selectGame;
	}catch (InputMismatchException e){
		System.out.println("La saisie ne semble pas bonne, merci de recommencer :");
		securityLoop++;}
		
		}while (securityLoop ==1);// fin de la boucle
	
// choix du Mode----------------------------------------------------------------------------------------------------------------------------------------	
	
	do{ // boucle en cas d'erreur de saisie
		try {
	securityLoop =0;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Quel mode voulez vous utiliser ?");	

	System.out.println("1. Challenger (trouver la combinaison secrète de l'ordinateur)");
	System.out.println("2. Défenseur  (l'ordinateur essaye de trouver votre combinaison secrète)");
	System.out.println("3. Duel       (tour à tour contre l'ordinateur)");
	System.out.println("4. Developpeur (affiche directement la solution pour étude du programme)");
	
	selectMode = sc.nextInt();
		}catch (InputMismatchException e){
			System.out.println("La saisie ne semble pas bonne, merci de recommencer :");
			securityLoop++;}
			
			}while (securityLoop ==1);// fin de la boucle	
}
}





