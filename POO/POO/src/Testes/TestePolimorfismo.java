package Testes;

public class TestePolimorfismo {
	public static void main(String args[]) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(00011100011L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristian");
		juridica.setCnpj(0011100011107L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for (Pessoa1 pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
