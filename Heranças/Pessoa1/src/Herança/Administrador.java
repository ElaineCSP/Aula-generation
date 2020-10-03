package Herança;

public class Administrador extends Pessoa1 {
	private float ajudaDeCusto;
	
	public Administrador (String nome, String endereço, int telefone, float ajudaDeCusto) {
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
