package exercicios;
/*
 * 18. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar.
 * Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar,
 * mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$101,53
 * resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.
 */

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor da conta R$: ");
		float conta = entrada.nextFloat();

		int carlos = (int) conta / 3;
		int andre = (int) conta / 3;
		float felipe = (conta % 3) + andre;

		System.out.println("\nCarlos pagará: R$ " + carlos);
		System.out.println("André pagará: R$ " + andre);
		System.out.printf("Felipe pagará: R$ %.2f", felipe);

	}
}
