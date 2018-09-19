package Tableau;

public class Pays {
	
	//Attributs
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private Ville lesVilles[];
	private int indice;
	
	//Constructeur
		//Défauts
	public Pays() {
		this.lesVilles = new Ville[50];
		this.indice = 0;
	}
		
		//Attributs
	public Pays(String unNom, String uneLangue, String uneMonnaie) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.indice = 0;
		
		this.saCapitale = new Capitale(/*prend*/);
		this.lesVilles = new Ville[50];
	}

	//Accesseurs
		//indice
	public int getIndice() {
		return indice;
	}
	public void setIndice(int unIndice) {
		this.indice = unIndice;
	}
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
		//Les villes
	public Ville[] getLesVilles() {
		return this.lesVilles;
	}
	public void setLesVilles(Ville[] uneLesVilles) {
		this.lesVilles = uneLesVilles;
	}
	
	//Méthodes
		//Ajouter une ville
	public void ajouterUneVille(Ville uneVille) {		
		this.lesVilles[this.indice] = uneVille;
		this.indice = this.indice + 1;
	}
		
		//Rechercher une ville
	public boolean rechercherUneVille(String unNom) {
		boolean recherche = false;
		int i = 0;
		
		while(i < this.indice && recherche == false) {
			if(this.lesVilles[i].getNom().equals(unNom)) {
				recherche = true;
			}
			else {
				i++;
			}
		}
		return recherche;
	}
	
		//Suppression
	public boolean suppressionVille(String unNom) {
		boolean recherche = false;
		int i = 0;
		
		while(i < this.indice && recherche == false) {
			if(this.lesVilles[i].getNom().equals(unNom)) {
				recherche = true;
				this.lesVilles[i] = new Ville();
			}
			else {
				i++;
			}
		}
		return recherche;
	}
	
		//toString
	public String toString() {
		String chaine;
		
		chaine = this.nom + " " + this.langue + " " + this.monnaie + " " + this.saCapitale.toString();
		for(int i = 0; i < this.indice; i++) {
			chaine = chaine  + " " + this.lesVilles[i];
		}
		return chaine;
	}
}