package Testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main (String args[]) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("João Silva", "JAVA", 6.8);
		Aluno b = new Aluno("Katia Pereira", "ADS", 8.0);
		Aluno c = new Aluno("José Carlos", "SI", 7.8);
		Aluno d = new Aluno("Priscila Cuzco", "BD", 9.2);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
