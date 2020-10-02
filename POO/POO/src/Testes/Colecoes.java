package Testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main(String args[]) {
		Collection<String> nomes = new ArrayList();
		
		nomes.add("Mauro");
		nomes.add("Mari");
		nomes.add("Rita");
		nomes.add("Cristiano");
		
		for(String name : nomes) {
			System.out.println("Lista de nomes: " + name);
		}
				
		//Collection<String> nomes2 = Arrays.asList("Manuela", "João");
		//nomes.addAll(nomes2);
		//System.out.println("Lista de nomes: " + nomes);
		
		/*System.out.println("Contém o nome Cristiano? " + nomes.contains("Cristiano"));
		System.out.println("Lista: " + nomes);
		*/
		
		/*System.out.println("Lista de nomes: " + nomes);
		nomes.clear();
		System.out.println("Lista de nomes: " + nomes);
		*/
		
		/*System.out.println("Lista de nomes: " + nomes);
		nomes.remove("Mauro");
		System.out.println("Lista de nomes: " + nomes);
		*/
		
		/*
		 
		 if(nomes.isEmpty()) {
			System.out.println("Lista vazia.");
		} else {
			System.out.println("Lista de nomes: " + nomes);
		}
		
		System.out.println("Lista de nomes: " + nomes);
		*/
	}
}
