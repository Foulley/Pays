package Tableau;
public class Capitale {
	
	//Attributs privé
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	//Constructeur
		//Défauts
	public Capitale(){
		
	}
	
		//Attributs
	public Capitale(String unNom, int unNbHabitants, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseur
		//Nom
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

		//NbHabitants
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
		//Superficie
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	//Méthode
		//toString
	public String toString(){
		String chaine = "";
		chaine = this.nom + "\n" + this.nbHabitants + "\n" + this.superficie + "\n";
		
		return chaine;
	}
}