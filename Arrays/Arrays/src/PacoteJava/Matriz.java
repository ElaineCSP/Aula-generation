package PacoteJava;

import java.util.*;

public class Matriz {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int i, j, num, op=0;
		
		int [][] matriz1 = new int [2][2];
		int [][] matriz2 = new int [2][2];
		
		int [][] matrizSoma = new int [2][2];
		int [][] matrizSub = new int [2][2];
		
		for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				System.out.printf("Digite um valor para matriz 1: ");
				matriz1[i][j]=ler.nextInt();
			}
		}
		
		for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				System.out.printf("Digite um valor para matriz 2: ");
				matriz2[i][j]=ler.nextInt();
			}
		}
		
		System.out.printf("\nEscolha uma opção: \n[1]Somar as duas matrizes;\n[2]Subtrair a primeira da segunda;"
				+ "\n[3]Adicionar uma constante nas duas matrizes;\n[4]Imprimir as duas matrizes;\nSua opção: ");
		op = ler.nextInt();
		
		switch(op) {
			case 1:
			for(i=0; i<2; i++) {
				for(j=0; j<2; j++) {
					matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			for(i=0; i<2; i++) {
				for(j=0; j<2; j++) {
					System.out.printf("[%d]", matrizSoma[i][j]);
				}
				
			}
			break;
			
			case 2:
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						matrizSub[i][j] = matriz1[i][j] - matriz2[i][j];
					}
				}
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.printf("[%d]", matrizSub[i][j]);
					}
				}
			break;
			
			case 3:
				System.out.printf("Digite um valor inteiro: ");
				num = ler.nextInt();
				
				//somando o valor digitado nas matrizes
				
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						matriz1[i][j]= matriz1[i][j] + num;
					}
				}
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						matriz2[i][j]= matriz2[i][j] + num;
					}
				}
				
				//imprimir o valor somado as matrizes
				
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matriz1[i][j]);
					}
				}
				
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.printf("[%d]", matriz2[i][j]);
					}
				}
				
			break;
			
			case 4:
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.printf("[%d]", matriz1[i][j]);
					}
				}
				for(i=0; i<2; i++) {
					for(j=0; j<2; j++) {
						System.out.printf("[%d]", matriz2[i][j]);
					}
				}
			
			break;
			
			default:
				System.out.printf("Você digitou um opção inválida, o programa foi encerrado!!");
				
			break;	
		}
	
	}
}
