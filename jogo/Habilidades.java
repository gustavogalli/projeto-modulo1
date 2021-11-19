package jogo;

public interface Habilidades {
	
	public abstract void apresentar();
	public abstract void recuperar();
	public abstract void descansar();
	public abstract void atacar(Player oponente, int tipoAtaque);
	public abstract void atingir(Player oponente, int tipoAtaque);
	public abstract void mensagem(Player oponente, int dano, int tipoAtaque);
	public abstract void verificar(Player oponente);
	public abstract void ganhar(Player oponente);
	public abstract int calcularDano();

}
