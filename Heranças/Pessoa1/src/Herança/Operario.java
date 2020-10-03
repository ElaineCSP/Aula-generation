package Herança;

public class Operario extends Pessoa1{
	private float valorProdução;
	private float comissao;
	
	public Operario(String nome, String endereço, int telefone, float valorProdução, float comissao) {
		super(nome, endereço, telefone);
		this.valorProdução = valorProdução;
		this.comissao = comissao;
	}

	public float getValorProdução() {
		return valorProdução;
	}

	public void setValorProdução(float valorProdução) {
		this.valorProdução = valorProdução;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
