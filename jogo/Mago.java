package jogo;

public class Mago extends Player {

	public Mago(String nome) {
		this.setNome(nome);
		this.setHp(120);
		this.setMana(80);
		this.setClasse("Guerreiro");
		this.setVivo(true);
	}

	@Override
	public void apresentar() {
		System.out.println("NOME:\t" + this.getNome());
		System.out.println("CLASSE:\t" + this.getClasse());
		System.out.println("HP:\t" + this.getHp());
		System.out.println("MANA:\t" + this.getMana());
		System.out.println("--------------------------------------");
	}

	@Override
	public void recuperar() {
		this.setHp(getHp() + 10);
		this.setMana(getMana() + 10);
	}

	@Override
	public void descansar() {
		this.setHp(getHp() + 20);
		this.setMana(getMana() + 40);
		System.out.println("\n--------------------------------------");
		System.out.println(this.getNome() + " resolveu descansar.");
		System.out.println("--------------------------------------\n");
	}

	@Override
	public void atacar(Player oponente, int tipoAtaque) {
		this.recuperar();
		this.atingir(oponente, tipoAtaque);
		this.verificar(oponente);
	}

	@Override
	public void atingir(Player oponente, int tipoAtaque) {
		if (tipoAtaque == 1) {
			if (this.getMana() < 20) {
				System.out.println("\n--------------------------------------");
				System.out.println(this.getNome() + ", você está sem Mana!");
				System.out.println("--------------------------------------\n");
			} else {
				int dano = this.calcularDano();
				oponente.setHp(oponente.getHp() - dano);
				this.setMana(this.getMana() - 20);
				this.mensagem(oponente, dano, tipoAtaque);
			}
		} else {
			if (this.getMana() < 40) {
				System.out.println("\n--------------------------------------");
				System.out.println(this.getNome() + ", você está sem Mana!");
				System.out.println("--------------------------------------\n");
			}
			int dano = this.calcularDano() * 2;
			oponente.setHp(oponente.getHp() - dano);
			this.setMana(this.getMana() - 40);
			this.mensagem(oponente, dano, tipoAtaque);
		}
	}

	@Override
	public void mensagem(Player oponente, int dano, int tipoAtaque) {
		if (tipoAtaque == 1) {
			System.out.println("\n--------------------------------------");
			System.out.println(this.getNome() + " bateu com o cajado na cabeça de " + oponente.getNome() + "!");
			if (dano == 50) {
				System.out.println("Dano crítico: 50");
				System.out.println("--------------------------------------\n");
			} else {
				System.out.println("Dano: " + dano);
				System.out.println("--------------------------------------\n");
			}
		} else {
			System.out.println("\n--------------------------------------");
			System.out.println(this.getNome() + " lançou uma bola de fogo em " + oponente.getNome());
			if (dano == 100) {
				System.out.println("DANO CRÍTICO: 100");
				System.out.println("--------------------------------------\n");
			} else {
				System.out.println("DANO: " + dano);
				System.out.println("--------------------------------------\n");
			}
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
			oponente.setHp(0);
			oponente.setVivo(false);
			this.ganhar(oponente);
		}
	}

	public void ganhar(Player oponente) {
		System.out.println("\n======================================");
		System.out.println(oponente.getNome() + " morreu!\n" + this.getNome().toUpperCase() + " VENCEU!");
		System.out.println("======================================\n");
//		System.out.println("--------------------------------------\n");
	}

}