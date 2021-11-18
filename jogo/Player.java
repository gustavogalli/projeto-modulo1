package jogo;

public abstract class Player {

	// Atributos
	private String nome;
	private int hp;
	private int mana;
	private String arma1;
	private String arma2;

	// Métodos
	public void status() {
		System.out.println("NOME: " + this.getNome());
		System.out.println("HP: " + this.getHp());
		System.out.println("MANA: " + this.getMana());
		System.out.println("ARMA 1: " + this.getArma1());
		System.out.println("ARMA 2: " + this.getArma2());
	}

	public void atacar() {

	}
	
	public void verificar() {
		
	}
	
	public void ganhar() {
		
	}
	
	public void calcularAtaque() {
		
	}

	public void usarEspecial() {
		
	}

	// Métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getArma1() {
		return arma1;
	}

	public void setArma1(String arma1) {
		this.arma1 = arma1;
	}

	public String getArma2() {
		return arma2;
	}

	public void setArma2(String arma2) {
		this.arma2 = arma2;
	}

}
