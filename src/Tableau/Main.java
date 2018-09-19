package Tableau;
import java.util.Scanner;

public class Main {
	private static Scanner clavier;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clavier = new Scanner (System.in);
		
		String unNom;
		Ville uneVille;
		Pays unPays = new Pays("France", "Francais", "Euro");
		int choix;
		int unNbH;
		int uneSuperficie;
		
		
		do{
			System.out.println("\n***** PAYS *****"
					+ "\n1 - Affichage"
					+ "\n2 - Recherche"
					+ "\n3 - Ajout"
					+ "\n4 - Suppression"
					+ "\n0 - Quitter");

			System.out.println("Quelle  est votre choix ? ");
			choix = clavier.nextInt();
			clavier.nextLine();

		
		while (choix > 4){
				System.out.println("Se choix n'existe pas, retapez votre choix :");
				choix = clavier.nextInt();
				clavier.nextLine();
		}
		
			switch(choix){
				case 1:			//Affichage	
					System.out.println("Pays" + unPays.toString());
					break;
			
				case 2:			//Recherche
					System.out.println("Quel est le nom de la ville à rechercher ?");
					unNom = clavier.nextLine();
					
					
					System.out.println(unPays.rechercherUneVille(unNom));
					break;
				
				case 3:			//ajout d'une ville
					System.out.println("Quel est le nom de la ville ?");
					unNom = clavier.nextLine();
					
					System.out.println("Quelle est le nombre d'habitants ?");
					unNbH = clavier.nextInt();
					
					System.out.println("Quelle est la superficie ?");
					uneSuperficie = clavier.nextInt();
					
					uneVille = new Ville(unNom, unNbH, uneSuperficie);
					unPays.ajouterUneVille(uneVille);
					
					break;
				
				case 4:			//départ d'une ville
					System.out.println("Quel est le nom de la ville ?");
					unNom = clavier.nextLine();
					unPays.suppressionVille(unNom);
					
					break;
					
				case 0:			//sortie					
					System.out.println("Fermeture du Programme");
					break;
				
			}
		}while(choix !=0);
		
	}

}