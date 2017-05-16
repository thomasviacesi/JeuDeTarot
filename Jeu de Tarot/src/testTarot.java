
public class testTarot {

	public static void main(String[] args) {

		Carte[] paquet = Jeu.initPaquet();
//		for (int i = 0; i < 78; i++) {
//			System.out.println(paquet[i].getCarte());
//		}
		
		Hand[] hands = new Hand[5];
		hands[0] = new Hand(18);
		hands[1] = new Hand(18);
		hands[2] = new Hand(18);
		hands[3] = new Hand(18);
		hands[4] = new Hand(78);
		Jeu.premiereDistribution(hands, paquet);
		
		System.out.println(hands[0].afficherMain());
		System.out.println("Voici la deuxieme main");
		System.out.println(hands[1].afficherMain());
		System.out.println("Voici la troisieme main");
		System.out.println(hands[2].afficherMain());
		System.out.println("Voici la quatrieme main");
		System.out.println(hands[3].afficherMain());
		System.out.println("Et voici le chien !");
		System.out.println(hands[4].afficherMain());
		// distribution terminée, on clean le paquet TODO
	}

}
