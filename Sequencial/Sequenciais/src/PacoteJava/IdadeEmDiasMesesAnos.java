package PacoteJava;

import java.util.Scanner;

public class IdadeEmDiasMesesAnos {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int anos, mes, dias, res;
		
		System.out.printf("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = dias / 365;
		mes = (dias % 365) / 30;
		dias = mes+dias;
		
		System.out.printf("Voc� tem " + anos + " anos, " + mes + " mes(es) e " + dias + (" dias!"));

	}
}
