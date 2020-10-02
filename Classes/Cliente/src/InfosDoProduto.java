
public class InfosDoProduto {
	public static void main(String args[]) {
		ProdutoEletronico produto = new ProdutoEletronico("Produto: Purificador de água", " \nCor: Cinza", "\nModelo: Consul");
		System.out.println(produto.getInfosDoProduto());
	}
}
