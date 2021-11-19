package jogo;

public class Batalha2 {

	public static void main(String[] args) {

		Guerreiro um = new Guerreiro("José");
		Guerreiro dois = new Guerreiro("Pedro");
		
		um.atacar(dois, 1);
		um.atacar(dois, 2);

		um.status();
		dois.status();
		
	}
}