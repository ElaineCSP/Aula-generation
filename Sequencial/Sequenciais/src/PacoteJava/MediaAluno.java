package PacoteJava;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		float n1, n2, n3, media;
		
		System.out.printf("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.printf("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.printf("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = ((n1*2) + (n2*3) + (n3*5)) / 10;
		
		System.out.printf("A média do aluno é %.1f", media);
	}
}
