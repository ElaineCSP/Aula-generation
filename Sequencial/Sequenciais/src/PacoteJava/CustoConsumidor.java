package PacoteJava;

import java.util.Scanner;

public class CustoConsumidor {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double custoFabri=0, custoConsumidor=0, porcDistribuidor=0.28, imposto=0.45;
		
		System.out.printf("Digite o custo de f�brica: ");
		custoFabri = entrada.nextDouble();
		
		custoConsumidor = custoFabri+(custoFabri*porcDistribuidor/100) + (custoFabri*imposto/100);
		
		System.out.printf("O custo do consumidor �: %.1f", custoConsumidor);
	}
}