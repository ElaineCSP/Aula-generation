package Heran�a;

public class Vendedor extends Pessoa1 {
	private float valorVendas;
	private float comissao;
	
	public Vendedor(String nome, String endere�o, int telefone, float valorVendas, float comissao) {
		super(nome, endere�o, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
}
