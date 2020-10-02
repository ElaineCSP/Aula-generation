package Testes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapAluno {
	public static void main(String args[]) {
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno("João Silva", "JAVA", 6.8);
		Aluno b = new Aluno("Katia Pereira", "ADS", 8.0);
		Aluno c = new Aluno("José Carlos", "SI", 7.8);
		Aluno d = new Aluno("Priscila Cuzco", "BD", 9.2);
		
		mapa.put("João Silva", a);
		mapa.put("Katia Pereira",b);
		mapa.put("José Carlos",c);
		mapa.put("Priscila Cuzco",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Priscila Cuzco"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e:alunos) {
			System.out.println(e);
		}
		
	}
}
