package PacoteJava;

import java.util.Scanner;

public class FabricaHorasMinSeg {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int horas, minutos, segundos;
		
		System.out.printf("Digite quantos segundos durou o evento da f�brica: ");
		segundos = ler.nextInt();
		
		horas = (segundos/3600);
		minutos = ((segundos % 3600) % 60);
		
		System.out.printf("A dura��o do evento foi de " + horas + " hora(s)" + minutos + " minuto(s) e "+
				segundos + " segundos");
		
	}
}