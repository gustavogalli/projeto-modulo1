package jogo;

public class Guerreiro extends Player {

	public Guerreiro() {
		this.setHp(75);
		this.setMana(75);
	}

	@Override
	public void atacar(Player oponente) {
		this.atingir(oponente);
		this.verificar(oponente);
	}

	public void usarEspecial(Player oponente) {
		this.atingirEspecial(oponente);
		this.verificar(oponente);
	}

	@Override
	public void atingir(Player oponente) {
		int dano = this.calcularDano();
		oponente.setHp(oponente.getHp() - dano);
		this.mensagemAtaque(oponente, dano);
	}

	@Override
	public void atingirEspecial(Player oponente) {
		int dano = this.calcularDano() * 2;
		oponente.setHp(oponente.getHp() - dano);
		this.mensagemEspecial(oponente, dano);
	}

	@Override
	public void mensagemAtaque(Player oponente, int dano) {
		System.out.println(this.getNome() + " deu um soco na barriga de " + oponente.getNome());
		if (dano == 50) {
			System.out.println("DANO CRÍTICO: 50");
		} else {
			System.out.println("DANO: " + dano);
		}
	}

	@Override
	public void mensagemEspecial(Player oponente, int dano) {
		System.out.println(this.getNome() + " soltou um Kamehameha em " + oponente.getNome());
		if (dano == 100) {
			System.out.println("DANO CRÍTICO: 100");
		} else {
			System.out.println("DANO: " + dano);
		}
	}

	@Override
	public int calcularDano() {
		double dado = Math.random();
		if (dado <= 0.25) {
			return 10;
		} else if (dado <= 0.5) {
			return 20;
		} else if (dado <= 0.75) {
			return 30;
		} else if (dado <= 0.9) {
			return 40;
		} else {
			return 50;
		}
	}

	public void verificar(Player oponente) {
		if (oponente.getHp() <= 0) {
			this.ganhar(oponente);
			oponente.setHp(0);
		}
	}

	public void ganhar(Player oponente) {
		System.out.println(oponente.getNome() + " morreu!\n" + this.getNome().toUpperCase() + " VENCE A BATALHA!\n");
	}

}