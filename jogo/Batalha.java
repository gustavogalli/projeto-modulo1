package jogo;

public class Batalha {

	public static void main(String[] args) {
		
		Guerreiro p1 = new Guerreiro();
		Guerreiro p2 = new Guerreiro();
		
		p1.setNome("Nero");
		p2.setNome("Papai Noel");
		
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		p1.atacar(p2, 15);
		
		p1.status();
		System.out.println();
		p2.status();
		
	}
}