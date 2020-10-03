package Heran�a;

public class Operario extends Pessoa1{
	private float valorProdu��o;
	private float comissao;
	
	public Operario(String nome, String endere�o, int telefone, float valorProdu��o, float comissao) {
		super(nome, endere�o, telefone);
		this.valorProdu��o = valorProdu��o;
		this.comissao = comissao;
	}

	public float getValorProdu��o() {
		return valorProdu��o;
	}

	public void setValorProdu��o(float valorProdu��o) {
		this.valorProdu��o = valorProdu��o;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
