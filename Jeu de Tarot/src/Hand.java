
public class Hand extends Tas{

	// Constructeur
	public Hand(int nbCartesMax) {
		super(nbCartesMax);
	}

	// Renvoie si une main est vide
	public boolean estVide() {
		return this.nbCartes == 0;
	}

	/**
	 * Insert une carte dans la main du joueur
	 * @param carte
	 * @return true si la carte a été insérée
	 */
	public boolean insererCarte(Carte carte){
		if(nbCartes < this.deck.length){
			deck[nbCartes] = carte;
			nbCartes++;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Carte[] getDeck() {
		return deck;
	}

	public void setDeck(Carte[] deck) {
		this.deck = deck;
	}

	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}

	// renvoie le nombre de cartes dans la main du joueur
	public int getNbCartes() {
		return this.nbCartes;
	}
}
