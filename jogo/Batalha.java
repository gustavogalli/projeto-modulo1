package jogo;

public class Batalha {

	public static void main(String[] args) {
		
		Guerreiro p1 = new Guerreiro();
		Guerreiro p2 = new Guerreiro();
		
		p1.setNome("Gustavo");
		p2.setNome("Borges");

		p1.atacar(p2, 10);
		p2.atacar(p1, 30);
		
		
		
	}
}