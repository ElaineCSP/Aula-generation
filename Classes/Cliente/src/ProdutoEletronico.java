
public class ProdutoEletronico {
	private String produto;
	private String cor;
	private String marca;
	
	public ProdutoEletronico(String produto, String cor, String marca) {
		this.produto = produto;
		this.cor = cor;
		this.marca = marca;
	}
	
	public String getInfosDoProduto() {
		String infosDoProduto = produto + " " + cor + " " + marca;
		return infosDoProduto;
	}
	
}
