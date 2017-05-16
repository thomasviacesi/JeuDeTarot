
public class testTarot {

	public static void main(String[] args) {


		Carte[] paquet = Jeu.init();
		for (int i = 0; i < 78; i++) {
			System.out.println(paquet[i].getCarte());
		}
	}

}
