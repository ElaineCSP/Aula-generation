
public class ContaBancaria {
	private String nome;
	private String sobrenome;
	private int agencia;
	private int conta;
	
	public ContaBancaria(String nome, String sobrenome, int ag, int conta) {
		this.nome = nome;
		this.sobrenome= sobrenome;
		this.agencia = ag;
		this.conta = conta;
	}
	
	public String getExibirDadosCB() {
		String exibirDadosCB = nome + " " + sobrenome + " " + agencia + " " + conta;
		return exibirDadosCB;
	}
}
