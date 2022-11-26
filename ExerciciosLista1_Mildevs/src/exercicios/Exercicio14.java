package exercicios;
/*
 * 14. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas
 * fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada
 * fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120
 * gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e
 * a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários
 * para compra.
 */

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de sanduiches: ");
		float qtdsandu = entrada.nextFloat();

		float qtdqueijo = (qtdsandu * 100) / 1000;
		float qtdpresunto = (qtdsandu * 50) / 1000;
		float qtdHamb = (qtdsandu * 120) / 1000;

		System.out.printf(
				"\nPara produzir %.0f sanduiches serão necessários:\n%.2f kgs de mussare"
						+ "la\n%.2f kgs de presunto\n%.2f kgs de rodelas de hamburguer",
				qtdsandu, qtdqueijo, qtdpresunto, qtdHamb);
	}
}
