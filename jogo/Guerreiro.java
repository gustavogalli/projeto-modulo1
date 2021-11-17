package jogo;

public class Guerreiro extends Player {

	public Guerreiro() {
		this.setHp(100);
		this.setMana(30);

	}

	public void atacar(Player oponente, int dano) {
		oponente.setHp(oponente.getHp() - dano);
		this.verificar(oponente);
	}
	
	public void verificar(Player oponente) {
		if(oponente.getHp() <= 0) {
			this.ganhar(oponente);
			oponente.setHp(0);
		}
	}
	
	public void ganhar(Player oponente) {
		System.out.println(oponente.getNome() + " morreu!\n" + this.getNome().toUpperCase() + " VENCE A BATALHA!\n");
	}
}