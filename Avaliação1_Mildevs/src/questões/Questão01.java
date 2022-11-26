package questões;
/*
 * Escreva um algoritmo para funcionar em um caixa eletrônico. O usuário digita o valor em dinheiro 
 * a ser sacado e o algoritmo deve exibir a quantidade de notas de 100 reais, 50 reais, 20 reais, 
 * 10 reais, 5 reais. O algoritmo deve dar preferencia para calcular a quantidade sempre com as notas maiores possíveis.
 *
 * Ex 01:
 * Digite a quantidade de dinheiro a ser sacada: 265
 *
 * Quantidades
 * 100 reais: 2
 * 50 reais: 1
 * 20 reais: 0
 * 10 reais: 1
 * 5 reais: 1
 *
 * Qualquer exceção no código deve ser tratada com um try catch. Caso o valor informado seja menor 
 * ou igual a (zero), exibir a mensagem. "Valor precisa ser maior que 0".
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão01 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	        int qtdDinheiro = 0;
			System.out.print("Digite a quantidade de dinheiro a ser sacada: ");
			
			try{
			   qtdDinheiro = entrada.nextInt();
			} catch(InputMismatchException erro){
			   System.out.print("\nO valor precisa ser numérico...");
			}

			int notas100 = 100;
			int notas50 = 50;
			int notas20 = 20;
			int notas10 = 10;
			int notas5 = 5;
			int resto1 = qtdDinheiro % 100;

			if (qtdDinheiro <= 0) {
				System.out.print("Valor precisa ser maior que 0");
			} else {
				System.out.print("\nQuantidades: ");
				if (qtdDinheiro >= notas100) {
					notas100 = qtdDinheiro / 100;
					resto1 = resto1 % 100;
					System.out.print("\nnotas de R$ 100,00: " + notas100);
					
				} else {
					System.out.print("\nnotas de R$ 100,00: 0 ");
				}
				if (resto1 >= notas50) {
					notas50 = resto1 / 50;
					resto1 = resto1 % 50;
					System.out.print("\nnotas de R$ 50,00: " + notas50);
					
				} else {
					System.out.print("\nnotas de R$ 50,00: 0 ");
				}
				if (resto1 >= notas20) {
					notas20 = resto1 / 20;
					resto1 = resto1 % 20;
					System.out.print("\nnotas de R$ 20,00: " + notas20);
					
				} else {
					System.out.print("\nnotas de R$ 20,00: 0 ");
				}
				if (resto1 >= notas10) {
					notas10 = resto1 / 10;
					resto1 = resto1 % 10;
					System.out.print("\nnotas de R$ 10,00: " + notas10);
					
				} else {
					System.out.print("\nnotas de R$ 10,00: 0 ");
				}
				if (resto1 >= notas5) {
					notas5 = resto1 / 5;
					resto1 = resto1 % 5;
					System.out.print("\nnotas de R$ 5,00: " + notas5);
					
				} else {
					System.out.print("\nnotas de R$ 5,00: 0 ");
				}
			}
		}
	}