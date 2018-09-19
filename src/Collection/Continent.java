package Collection;

import java.util.ArrayList;

public class Continent {
	
	//Attributs
	private String nom;
	private ArrayList<Pays> lesPays;
	
	//Constructeur
			//Défauts
	public Continent() {
		this.lesPays = new ArrayList<Pays>();
	}
			
			//Attributs
	public Continent(String unNom) {
		this.nom = unNom;
		
		this.lesPays = new ArrayList<Pays>();
	}
	
	//Accesseur
		//nom
	public String getNom(){
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
		//Pays
	public ArrayList<Pays> getLesPays() {
		return lesPays;
	}
	//Méthodes
		//Ajouter un pays
	public void ajouterUnPays(Pays unPays) {		
		this.lesPays.add(unPays) ;
	}
		
		//Supprimer un pays
	public boolean supprimerUnPays(String unNom) {		
		boolean recherche = false;
		int i = 0;
		
		while(i < this.lesPays.size() && recherche == false) {
			if(this.lesPays.get(i).getNom().equals(unNom)){
				recherche = true;
				this.lesPays.remove(i);
			}
			else{
				i++;
			}
		}
		return recherche;
	}
	
		//toString
	public String toString(){
		String chaine = "";
		
		for(int i = 0; i < this.lesPays.size(); i++){
			chaine = chaine + " "  + this.lesPays.get(i).getNom() + " " + this.lesPays.get(i).getLangue() + " " + this.lesPays.get(i).getMonnaie();
		}
		
		return chaine;
		
	}

	
}
