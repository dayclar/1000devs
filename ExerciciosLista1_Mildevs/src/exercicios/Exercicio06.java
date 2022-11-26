package exercicios;
/* 
 * 6. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
 * todos os cavalos comprados para um haras. O usuário devera informar a quantidade de
 * cavalos adquiridos. 
 */

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe a quantidade de cavalos: ");
		int qtdCavalos = teclado.nextInt();

		System.out.print("Informe o valor de cada ferradura: ");
		float vlFerraduras = teclado.nextFloat();

		int qtdFerraduras = qtdCavalos * 4;
		float vlTotal = vlFerraduras * qtdFerraduras;

		System.out.println("\nA quantidade de ferraduras necessárias: " + qtdFerraduras);
		System.out.printf("Valor total para a compra das ferraduras: R$ %.2f ", vlTotal);
	}
}