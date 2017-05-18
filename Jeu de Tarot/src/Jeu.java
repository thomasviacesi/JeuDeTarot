
public class Jeu {

	/**
	 * Initialise le paquet en début de partie
	 * @return Carte[] paquet
	 */
	public static Carte[] initPaquet() {
		Carte[] paquet = new Carte[78];
		int i = 0; // compteur
		// Création des atouts
		for(i=0; i < 22; i++) {
			paquet[i] = new Carte(0, i+1);
		}
		// Création des autres cartes
		for(int j=1; j < 15; j++) {
			// les coeurs
			paquet[i] = new Carte(1, j);
			i++;
			// les piques
			paquet[i] = new Carte(2, j);
			i++;
			// les trèfles
			paquet[i] = new Carte(3, j);
			i++;
			// les carreaux
			paquet[i] = new Carte(4, j);
			i++;
		}
		return paquet;
	}
	
	/**
	 * Toute première distribution, aléatoire au tarot
	 * @param hand
	 * @param paquet
	 */
	public static void premiereDistribution(Hand[] hand, Carte[] paquet) {
		
		int random, tailleALire = paquet.length-1;
		// toute premiere distribution (aléatoire total)
		for (int j = 0; j < 4; j++) { // On distribue aux 4 joueurs
			while(hand[j].getNbCartes() != 18) {
				random = (int) (Math.round(Math.random() * tailleALire));
				hand[j].insererCarte(paquet[random]);
				// On va maintenant positionner la valeur choisie à la fin du paquet et
				// décrémenter de 1 la taille à lire du tableau
				Carte tampon;
				for (int i = random; i < tailleALire; i++) {
					tampon = paquet[i];
					paquet[i] = paquet[i + 1];
					paquet[i + 1] = tampon;			
				}
				tailleALire --;
			}
		}
		
		//Il reste le chien
		int j = 0; // indice du chien
		for (int i =0; i < tailleALire ; i++) {
			hand[4].insererCarte(paquet[i]);
		}

		hand[0].trierCartes();
		hand[1].trierCartes();
		hand[2].trierCartes();
		hand[3].trierCartes();
		hand[4].trierCartes();
		
		// Tout le monde est servi, on reset le paquet car il ne nous sert plus
		//clean(paquet);
	}
	
	/**
	 * Le paquet/deck est vidé
	 * @param Carte[] paquet
	 * @return Carte[] paquet vidé
	 */
	public static void clean(Carte[] paquet) {
		for (int i = 0; i<paquet.length; i++) {
			paquet[i] = new Carte(99,0);
		}
	}
}
