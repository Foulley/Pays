package Collection;
import java.util.ArrayList;

public class Pays {
	
	//Attributs
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private ArrayList<Ville> lesVilles;
	
	//Constructeur
		//Défauts
	public Pays() {
		this.lesVilles = new ArrayList<Ville>();
	}
		
		//Attributs
	public Pays(String unNom, String uneLangue, String uneMonnaie) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		
		this.saCapitale = new Capitale(/*prend*/);
		this.lesVilles = new ArrayList<Ville>();
	}

	//Accesseurs
		//Nom
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
		//Langue
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
		//Monnaie
	public String getMonnaie() {
		return monnaie;
	}
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	
	//Méthodes
		//Ajouter une ville
	public void ajouterUneVille(Ville uneVille) {
		this.lesVilles.add(uneVille) ;
	}
		
		//Rechercher une ville
	public boolean rechercherUneVille(String unNom) {
		boolean recherche = false;
		int i = 0;
		
		while(i < this.lesVilles.size() && recherche == false) {
			if(this.lesVilles.get(i).getNom().equals(unNom)){
				recherche = true;
			}
			else{
				i++;
			}
		}
		return recherche;
	}
	
		//Suppression
	public boolean suppressionVille(String unNom) {
		boolean recherche = false;
		int i = 0;
		
		while(i < this.lesVilles.size() && recherche == false) {
			if(this.lesVilles.get(i).getNom().equals(unNom)){
				recherche = true;
				this.lesVilles.remove(i);
			}
			else{
				i++;
			}
		}
		return recherche;
	}
	
		//toString
	public String toString() {
		String chaine;
		
		chaine = this.nom + " " + this.langue + " " + this.monnaie + " " + this.saCapitale.toString() + " " + this.lesVilles;
		
		return chaine;
	}
}