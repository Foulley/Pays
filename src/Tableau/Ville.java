package Tableau;
public class Ville {
	
	//Attributs
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	//Constructeur
		//D�fauts
	public Ville(){
		
	}
		
		//Attributs
	public Ville(String unNom, int unNbHabitants, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseurs
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
	

	//M�thodes
		//toString
	public String toString(){
		String chaine = "";
		chaine = this.nom + "\n" + this.nbHabitants + "\n" + this.superficie;
		
		return chaine;
	}
}