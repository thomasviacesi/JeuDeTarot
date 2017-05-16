
public class Hand {

	// Liste de cartes de la main
	private Carte listeCartes[];

	// Nombre de cartes dans la main
	private int NbCartes;

	// Constructeur
	public Hand() {
		this.listeCartes = new Carte[20];
		NbCartes = 0;
	}

	// Renvoie si une main est vide
	public boolean estVide() {
		return this.NbCartes == 0;
	}

	// renvoie le nombre de cartes dans la main du joueur
	public int getNbCartes() {
		return this.NbCartes;
	}

	/**
	 * Insert une carte dans la main du joueur
	 * @param carte
	 * @return true si la carte a été insérée
	 */
	public boolean insererCarte(Carte carte){
		if(this.NbCartes < 20){
			this.listeCartes[this.NbCartes] = carte;
			this.NbCartes++;
			return true;
		}
		else{
			return false;
		}
	}
}
