import java.util.InputMismatchException;
import java.util.Scanner;

public class nbEssai extends LibrairyAbstract{


		
		public nbEssai(int nbEssai) {
					
		securityLoop  = 0;
		do{ // boucle en cas d'erreur de saisie
		try {
		securityLoop =0;

		Scanner sc = new Scanner (System.in);
		System.out.println("Combien de tentatives avant de perdre le jeux ?");
		nbEssai = sc.nextInt();
		this.nbEssai=nbEssai;
		
		}catch (InputMismatchException e){
		System.out.println("La saisie ne semble pas bonne, merci de recommencer :");
		securityLoop++;}
		

		}while (securityLoop ==1);// fin de la boucle
		
			
}

	

}
