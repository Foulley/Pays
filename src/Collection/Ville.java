package Collection;

public class Ville {
	
	//Attributs
	private String nom;
	private int nbHabitants;
	private int superficie;
	private Pays sonPays;
	
	//Constructeur
		//Défauts
	public Ville(){
		
	}
		
		//Attributs
	public Ville(String unNom, int unNbHabitants, int uneSuperficie, Pays unPays){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
		this.sonPays = unPays;
		this.sonPays.ajouterUneVille(this);
	}
	
	//Accesseurs
		//Nom
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

		//NbHabitants
	public int getNbHabitants() {
		return this.nbHabitants;	
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
		//Superficie
	public int getSuperficie() {
		return this.superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
		//Son pays
	public Pays getPays(){
		return this.sonPays;
	}

	//Méthodes
		//toString
	public String toString(){
		String chaine = "";
		chaine = this.nom + "\n" + this.nbHabitants + "\n" + this.superficie;
		
		return chaine;
	}
}