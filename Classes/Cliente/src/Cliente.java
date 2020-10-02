
public class Cliente {
	private String primeiroNome;
	private String ultimoNome;
	private int cpf;
	
	public Cliente(String primeiro, String ultimo, int cpf) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		this.cpf = cpf;
	}
	
	public String getDadosCliente() {
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		return nomeCompleto + cpf;
	}
}

