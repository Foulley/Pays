package Collection;

import java.util.Scanner;

public class Main {
	private static Scanner clavier;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clavier = new Scanner (System.in);
		
		String unNom;
		String uneMonnaie;
		String uneLangue;
		String uneCapitale;
		
		Ville uneVille;
		Pays unPays = null;
		Continent unContinent = new Continent();
		
		int choix;
		int unNbH;
		int uneSuperficie;
		
		System.out.println("askip j'ai modifié mon code mamen");
		
		/*c'est un commentaire nul*/
		/*J'ai encore ajouté un commentaire nul*/
		
		/*Commentaire déniz*/
		/* BOOUUUUM */
		
		do{
			System.out.println("\n***** PAYS *****"
					+ "\n1 - Affichage tout"
					+ "\n2 - Recherche ville"
					+ "\n3 - Ajout Ville"
					+ "\n4 - Suppression Ville"
					+ "\n5 - Ajout Pays"
					+ "\n6 - Suppression Pays"
					+ "\n7 - Présenter Pays"
					+ "\n0 - Quitter");

			System.out.println("Quelle  est votre choix ? ");
			choix = clavier.nextInt();
			clavier.nextLine();

		
		while (choix > 7){
				System.out.println("Se choix n'existe pas, retapez votre choix :");
				choix = clavier.nextInt();
				clavier.nextLine();
		}
		
			switch(choix){
				case 1:			//Affichage	
					System.out.println("Pays" + unPays.toString() + "\n");
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
					
					uneVille = new Ville(unNom, unNbH, uneSuperficie, unPays);
					unPays.ajouterUneVille(uneVille);
					
					break;
				
				case 4:			//départ d'une ville
					System.out.println("Quel est le nom de la ville ?");
					unNom = clavier.nextLine();
					
					System.out.println(unPays.suppressionVille(unNom));
					
					break;
					
				case 5:			//Ajout d'un pays
					System.out.println("Quel est le nom du pays");
					unNom = clavier.nextLine();
					
					System.out.println("Quelle est la langue ?");
					uneLangue = clavier.nextLine();
					
					System.out.println("Quelle est la monnaie ?");
					uneMonnaie = clavier.nextLine();
					
					System.out.println("Quelle est sa Capitale ?");
					uneCapitale = clavier.nextLine();
					
					unPays = new Pays(unNom, uneLangue, uneMonnaie);
					unContinent.ajouterUnPays(unPays);
					
					break;
					
				case 6:			//départ d'un pays
					System.out.println("Quel est le nom de la ville ?");
					unNom = clavier.nextLine();
					
					System.out.println(unContinent.supprimerUnPays(unNom));
					
					break;
					
				case 7:			//Affichage d'un pays
					System.out.println(unContinent.toString());
					
					break;
					
				case 0:			//sortie					
					System.out.println("Fermeture du Programme");
					break;
				
			}
		}while(choix !=0);
		
	}

}