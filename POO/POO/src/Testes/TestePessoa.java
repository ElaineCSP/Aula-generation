package Testes;

public class TestePessoa {
	public static void main(String args[]) {
		Pessoa elaine = new Pessoa("Elaine", 555);
		Funcionario1 cristina = new Funcionario1("Cristina",222,"TI");
		Pessoa maria = new Funcionario1("Maria", 333, "Inform�tica");
		Pessoa jose = new Coordenador("Jos�", 444, "CI�NCIA");
		
		System.out.println(elaine.getMatricula());
		System.out.println(cristina.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		
	}
}
