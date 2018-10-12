import java.util.Random;
import java.util.Scanner;


import java.util.InputMismatchException;

public enum ClassEnum {
	
comuptAttack(),

userAttack(),
nbAttempt(),

Menu();

int nbEssais;
int nbChiffres;
int userInput;
int selectGame;	
int selectMode;		


	

	public ClassEnum() {
			
		int securityLoop  = 0;
		do{ // boucle en cas d'erreur de saisie
		try {
		securityLoop =0;

		Scanner sc = new Scanner (System.in);
		System.out.println("Combien de tentatives avant de perdre le jeux ?");
		nbEssais = sc.nextInt();
		this.nbEssais=nbEssais;
		
		}catch (InputMismatchException e){
		System.out.println("La saisie ne semble pas bonne, merci de recommencer :");
		securityLoop++;}
		
	
		}while (securityLoop ==1);// fin de la boucle
		
			
		}

	public void nbFigures() {
	
		int securityLoop  = 0;
		do{ // boucle en cas d'erreur de saisie
			try {
			securityLoop =0;
			Scanner sc = new Scanner (System.in);
			System.out.println("Combien de chiffres voulez vous utiliser ?");
			nbChiffres = sc.nextInt();
			this.nbChiffres=nbChiffres;
			
			}catch (InputMismatchException e){
			System.out.println("Je ne comprend pas votre réponse désolé, essayez encore");
			securityLoop++;}
			
		
			}while (securityLoop ==1);// fin de la boucle
							
			}
		
	
	public void userInput() {
			
	
	int securityLoop  = 0;
	do{ // boucle en cas d'erreur de saisie
		try {
		securityLoop =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Choisissez votre combinaison à "+nbChiffres);
		userInput = sc.nextInt();
		this.userInput=userInput;
		
		}catch (InputMismatchException e){
		System.out.println("Je ne comprend pas votre réponse désolé, essayez encore");
		securityLoop++;}
		
	
		}while (securityLoop ==1);// fin de la boucle
						
		}
		
	
}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	


