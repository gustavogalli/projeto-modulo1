package jogo;

public abstract class Player implements Habilidades {

	// Atributos
	private String nome;
	private String classe;
	private int hp;
	private int mana;
	private boolean vivo;

	// Métodos
//	public void status() {
//		System.out.println("-----------------------------");
//		System.out.println("NOME\t\tHP\tMANA");
//		System.out.println(this.getNome().toUpperCase() + "\t\t" + this.getHp() + "\t" + this.getMana());
//		System.out.println("Vivo? " + this.isVivo());
//		System.out.println("-----------------------------");
//	}

	public abstract void apresentar();
	public abstract void recuperar();
	public abstract void descansar();
	public abstract void atacar(Player oponente, int tipoAtaque);
	public abstract void atingir(Player oponente, int tipoAtaque);
	public abstract void mensagem(Player oponente, int dano, int tipoAtaque);
	public abstract void verificar(Player oponente);
	public abstract void ganhar(Player oponente);
	public abstract int calcularDano();

	// Métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

}
