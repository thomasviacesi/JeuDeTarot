
public class Jeu {

	
	public static Carte[] init() {
		Carte paquet[];
		paquet = new Carte[78];
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
}
