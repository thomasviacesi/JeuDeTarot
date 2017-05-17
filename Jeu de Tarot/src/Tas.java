public class Tas {

	// Liste de cartes de la main
	public Carte deck[];

	// Nombre de cartes dans la main
	public int nbCartes;

	// Constructeur
	public Tas(int nbCartesMax) {
		this.deck = new Carte[nbCartesMax];
		for(int i = 0; i < nbCartesMax; i++) {
			deck[i] = new Carte(99, 0); //on rempli de cartes "vide"
		}
		nbCartes = 0;
	}
	
	/**
	 * Tri à bulles pour organiser la main à chaque carte jouée ou lorsque la main est distribuée
	 * @param Carte[] deck
	 */
	protected void trierCartes() {
		Carte tampon = null;
		boolean permuter;
 
		// On trie les cartes par couleur
		do {
			permuter = false;
			for (int i = 0; i < deck.length - 1; i++) {
				// On regarde si les 2 éléments successifs sont dans le bon ordre au niveau de la couleur
				if (deck[i].couleurCarte > deck[i + 1].couleurCarte) {
					// s'ils ne le sont pas, on échange leurs positions
					tampon = deck[i];
					deck[i] = deck[i + 1];
					deck[i + 1] = tampon;
					permuter = true;					
				}
				/* On regarde maintenant si les 2 cartes ont la même couleur. Si c'est le cas,
				 * on les trie également
				 */
				if (deck[i].couleurCarte == deck[i + 1].couleurCarte) {
					if (deck[i].numeroCarte > deck[i + 1].numeroCarte) {
						tampon = deck[i];
						deck[i] = deck[i + 1];
						deck[i + 1] = tampon;
						permuter = true;
					}
				}
			}
		} while (permuter);		
	}
	
	public String afficherMain() {
		String result = "";
		for (int i = 0; i < deck.length; i++) {
			if(deck[i].couleurCarte != 99){ // on verifie qu'il s'agisse d'une carte
				result += deck[i].getCarte() + '\n';
			}
		}
		return result;
	}	
	
	/**
	 * Insert une carte dans le tas
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
		
}
