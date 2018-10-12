import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Duel_plusOuMoins extends LibrairyAbstract{
	
	public Duel_plusOuMoins() {
		
	Object test  = new nbEssai(0);
	
	System.out.println(nbEssai);
		
	}
	
		
		
		
		
		
		
public void nbFigures() {

	int securityLoop  = 0;
	do{ // boucle en cas d'erreur de saisie
		try {
		securityLoop =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Combien de chiffres voulez vous utiliser ?");
		nbChiffre = sc.nextInt();
		this.nbChiffre=nbChiffre;
		
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
	System.out.println("Choisissez votre combinaison à "+nbChiffre);
	userInput = sc.nextInt();
	this.userInput=userInput;
	
	}catch (InputMismatchException e){
	System.out.println("Je ne comprend pas votre réponse désolé, essayez encore");
	securityLoop++;}
	

	}while (securityLoop ==1);// fin de la boucle
					
	}
	
		
		
		
		
		
		// jeu d'intro-- aléa pour déterminer qui commence :)
				
//	System.out.println("Déterminons, qui va commencer :");
//	System.out.println("Un chiffre de 1 à 10 vient d'être caché");
//	System.out.println("Le plus proche entre l'ordinateur et vous commence");
//	Random rand = new Random();
//	int whoStart = rand.nextInt(11);
//	
//	System.out.println("Entrez votre chiffre :");
//	Scanner sc = new Scanner(System.in);
//	int userAttack = sc.nextInt();
//	rand = new Random();
//	int computeAttack = rand.nextInt(11);
//	System.out.println("Le chiffre caché est "+whoStart+" Vous avez proposé "+userAttack+" L'ordinateur a proposé "+computeAttack);
//	System.out.println(userAttack - whoStart);
//	System.out.println(computeAttack - whoStart);
//	//if (userAttack - whoStart)
//	// à finir
	

	
	
	
	
	
		
	}
	

