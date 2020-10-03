package Herança;

public class TesteAdministrador {
	public static void main(String args[]) {
		Administrador testeAdministrador = new Administrador("Manuel", "Rua Parada", 23234545, 1000);
		
		System.out.println("Nome: " + testeAdministrador.getNome());
		System.out.println("Endereço: " + testeAdministrador.getEndereço());
		System.out.println("Telefone: " + testeAdministrador.getTelefone());
		System.out.println("O valor da ajuda de custos é de: " + testeAdministrador.getAjudaDeCusto());
	}
}
