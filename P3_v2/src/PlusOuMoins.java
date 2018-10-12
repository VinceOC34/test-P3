import java.util.InputMismatchException;
import java.util.Scanner;

public class PlusOuMoins extends LibrairyAbstract {
	
public PlusOuMoins() {
	
	// choix du Mode----------------------------------------------------------------------------------------------------------------------------------------	
	
				do{ // boucle en cas d'erreur de saisie
					try {
				securityLoop =0;
				Scanner sc = new Scanner (System.in);
				System.out.println("Menu Plus ou Moins - Quel mode voulez vous utiliser ?");	
				System.out.println();	
				
				System.out.println("1. Challenger (trouver la combinaison secrète de l'ordinateur)");
				System.out.println("2. Défenseur  (l'ordinateur essaye de trouver votre combinaison secrète)");
				System.out.println("3. Duel       (tour à tour contre l'ordinateur)");
				System.out.println("4. Retourner au menu général pour changer de Jeu");
				selectMode = sc.nextInt();
					}catch (InputMismatchException e){
						System.out.println("La saisie ne semble pas bonne, merci de recommencer :");
						securityLoop++;}
						
						}while (securityLoop ==1);// fin de la boucle
				
			if (selectMode ==1) {
				
				Object one = new Challenger_plusOuMoins();
			}
			
				else if (selectMode ==3) {
					
					Object three = new Duel_plusOuMoins();	
				}
			
				else if (selectMode ==4) {
						Object men = new Menu();
				
			}
				
			}
			
	
	
	
}
	


