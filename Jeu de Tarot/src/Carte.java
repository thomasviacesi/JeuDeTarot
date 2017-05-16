
public class Carte {

	/* {1...14} de As à Roi s'il ne s'agit pas d'un atout
	 * {1...22} s'il s'agit d'un atout (22 étant l'excuse)
	 */
	int numeroCarte;
	
	/*
	 * 0 = Atout
	 * 1 = Coeur
	 * 2 = Pique 
	 * 3 = Trèfle
	 * 4 = Carreau
	 */
	int couleurCarte;
		
	/*
	 * Constructeur
	 */
	public Carte(int numeroCarte, int couleurCarte) {
		this.numeroCarte = numeroCarte;
		this.couleurCarte = couleurCarte;
	}

	// Renvoie le numéro de carte
	public int getNumeroCarte() {
		return numeroCarte;
	}
	
	// Renvoie la couleur de carte
	public int getCouleurCarte() {
		return couleurCarte;
	}
	
	// Calcule et renvoie les points que vaut la carte
	public float valeurCarte() {
		float pointsCarte;
		// Nous ne sommes pas dans le cas d'un atout
		if (couleurCarte != 0) {
			switch(numeroCarte) {
			case 1: 
			
				
				
			}
		}
		return 
	}
	
}
