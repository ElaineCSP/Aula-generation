package Heran�a;

public class Administrador extends Pessoa1 {
	private float ajudaDeCusto;
	
	public Administrador (String nome, String endere�o, int telefone, float ajudaDeCusto) {
		super(nome, endere�o, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
