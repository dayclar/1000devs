package exercicios;

/*
 * 1. Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a
 * área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário
 * informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo
 * metro quadrado.
 */

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos metros o terreno possui de frente: ");
		float frente_mef = entrada.nextFloat();

		System.out.print("Quantos metros o terreno possui de lateral: ");
		float lateral_mef = entrada.nextFloat();

		System.out.print("Informe o valor do metro quadrado: ");
		float metroqdf = entrada.nextFloat();

		float area = frente_mef * lateral_mef;
		float valor_terreno = area * metroqdf;

		System.out.printf("\nArea total do terreno de %.2f mts de frente com %.2f" + "mts de lateral é: %.2f mts \n",
				frente_mef, lateral_mef, area);
		System.out.printf("O valor deste terreno é: R$ %.2f", valor_terreno);
	}
}
