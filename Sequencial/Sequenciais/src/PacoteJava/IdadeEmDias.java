package PacoteJava;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int anos, meses, dias, res;
		
		System.out.printf("Quantos anos voc� tem? ");
		anos = ler.nextInt();
		
		System.out.printf("Quantos meses voc� tem? ");
		meses = ler.nextInt();
		
		System.out.printf("Quantos dias voc� tem? ");
		dias = ler.nextInt();
		
		res = dias +(anos*365)+(meses*30);
		
		System.out.printf("Sua idade em dias � %d", res);
	}
}

