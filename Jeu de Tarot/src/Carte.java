
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

	// la valeur de la carte lors du décompte
	double valeurCarte;
	
	/**
	 * Constructeur
	 * @param couleurCarte
	 * @param numeroCarte
	 */
	public Carte(int couleurCarte, int numeroCarte) {
		this.couleurCarte = couleurCarte;
		this.numeroCarte = numeroCarte;
		this.valeurCarte = calculerValeurCarte(numeroCarte, couleurCarte);
	}

	// Renvoie la couleur de carte
	public int getCouleurCarte() {
		return couleurCarte;
	}

	// Renvoie le numéro de carte
	public int getNumeroCarte() {
		return numeroCarte;
	}


	// Renvoie la valeur de la carte
	public double getValeurCarte() {
		return valeurCarte;
	}
	
	/**
	 * Calcule et renvoie la valeur de la carte
	 * @param numeroCarte
	 * @param couleurCarte
	 * @return double valeur de la carte
	 */
	public double calculerValeurCarte(int numeroCarte, int couleurCarte) {
		double pointsCarte = 0.5;
		// Nous ne sommes pas dans le cas d'un atout
		if (couleurCarte != 0) {
			switch(numeroCarte) {
			case 14:	pointsCarte = 5;
			break;
			case 13:	pointsCarte = 4;
			break;
			case 12:	pointsCarte = 3;
			break;
			case 11:	pointsCarte = 2;
			break;
			default:	pointsCarte = 0.5;
			}
		} else if (estUnBout(this)) {
			pointsCarte = 5;
		}
		return pointsCarte;
	}

	// Renvoie true si la carte est un bout
	public boolean estUnBout(Carte carte) {
		return (carte.couleurCarte == 0 && carte.numeroCarte == 1 
				|| carte.numeroCarte == 21 || carte.numeroCarte == 22);
	}

	/**
	 * Renvoie un descriptif de la carte
	 * @return String descriptif de la carte
	 */
	public String getCarte() {
		String result = "";
		switch(this.numeroCarte) {
		case 14:	result = "Roi";
		break;
		case 13:	result = "Dame";
		break;
		case 12:	result = "Cavalier";
		break;
		case 11:	result = "Valet";
		break;
		case 1:		result = "As";
		break;
		case 22:	return "Excuse";
		default:	result = Integer.toString(this.numeroCarte);
		break;
		}
		switch(this.couleurCarte) {
		case 0:		result = Integer.toString(this.numeroCarte) + " d'Atout";
		break;
		case 1:		result += " de Coeur";
		break;
		case 2:		result += " de Pique";
		break;
		case 3:		result += " de Trèfle";
		break;
		case 4:		result += " de Carreau";
		break;
		}
		return result;
	}

}
