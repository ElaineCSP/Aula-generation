package PacoteJava;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int anos, meses, dias, res;
		
		System.out.printf("Quantos anos você tem? ");
		anos = ler.nextInt();
		
		System.out.printf("Quantos meses você tem? ");
		meses = ler.nextInt();
		
		System.out.printf("Quantos dias você tem? ");
		dias = ler.nextInt();
		
		res = dias +(anos*365)+(meses*30);
		
		System.out.printf("Sua idade em dias é %d", res);
	}
}

