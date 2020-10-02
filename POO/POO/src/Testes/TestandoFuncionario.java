package Testes;

public class TestandoFuncionario {
	public static void main(String args[]) {
		Funcionario func = new Funcionario();
		
		func.setNome("Elaine");
		func.setSalario(4500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
