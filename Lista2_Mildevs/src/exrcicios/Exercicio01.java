package exrcicios;
/*
 * Questão 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para
 * imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário
 * informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro
 * quadrado. Caso a diferença de metragem entre a frente e a lateral seja menor que 10% da
 * metragem da frente, o cliente terá um acréscimo de 22% no valor final do terreno. Caso a metragem da frente for menor que 40% da lateral, o cliente terá um desconto de 12% no
 * valor final do terreno. Caso a metragem da frente for maior que 70% da lateral, o cliente terá um
 * desconto de 15%. Caso as medidas não encaixem em nenhuma das regras o valor final do
 * terreno não sofrerá alterações.
 */

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor da frente: ");
		float frente = entrada.nextFloat();

		System.out.print("Informe o valor da lateral: ");
		float lateral = entrada.nextFloat();

		System.out.print("Informe o valor do metro quadrado: ");
		float metroqd = entrada.nextFloat();

		float porcentafren = frente * 0.10f;
		float porcentalateral = lateral * 0.40f;
		float porcentalateral2 = lateral * 0.70f;

		float diferenca = Math.abs(frente - lateral);

		float area = frente * lateral;
		float vlmetroqd = area * metroqd;

		if (frente < porcentalateral) {

			porcentalateral = lateral * 0.40f;
			float vlvenda = vlmetroqd - (vlmetroqd * 0.12f);

			System.out.printf(
					"\nA Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: "
							+ "%.2f mts.\nO terreno recebeu um decréscimo de 12%% e " + "custará: R$ %.2f",
					frente, lateral, area, vlvenda);

		} else if (diferenca < porcentafren) {

			porcentafren = frente * 0.10f;
			float vlvenda = (vlmetroqd * 0.22f) + vlmetroqd;

			System.out.printf(
					"\nA Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: "
							+ "%.2f mts.\nO terreno recebeu um acréscimo de 22%% e " + "custará: R$ %.2f",
					frente, lateral, area, vlvenda);

		} else if (frente > porcentalateral2) {

			porcentalateral2 = lateral * 0.70f;
			float vlvenda = vlmetroqd - (vlmetroqd * 0.15f);

			System.out.printf(
					"\nA Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: "
							+ "%.2f mts.\nO terreno recebeu um decréscimo de 15%% e " + "custará: R$ %.2f",
					frente, lateral, area, vlvenda);

		} else {

			System.out.printf(
					"\nA Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: "
							+ "%.2f mts.\nO terreno não recebeu nenhuma alteração e " + "custará: R$ %.2f",
					frente, lateral, area, vlmetroqd);

		}
	}
}