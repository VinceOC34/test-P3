import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends LibrairyAbstract{
	
public Menu() {
	
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
			
		if (selectGame==1) {
		Object plusOuMoins = new PlusOuMoins();	
		}
		else if (selectGame ==2) {
			Object master = new Mastermind();
		}
			
}
	
}
	


