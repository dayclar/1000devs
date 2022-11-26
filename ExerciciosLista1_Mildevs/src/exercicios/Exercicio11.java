package exercicios;
/*
 * 11. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de
 * maracujá. Faça um algoritmo para calcular quantos litros de água e de suco são
 * necessários para se fazer uma certa quantidade de litros de refresco informados pelo usuário.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		System.out.print("Digite a Qtd de litros de suco necessária: ");
		float totalSuco = entrada.nextFloat();

		float litagua = totalSuco * 0.8f;
		float litsuco = totalSuco * 0.2f;

		System.out.print("\nSerá necessário para fazer " + format.format(totalSuco) + " lts de suco de maracujá:\n");
		System.out.print(format.format(litagua) + " lts de água\n");
		System.out.print(format.format(litsuco) + " lts de suco concentrado de maracujá");

	}
}