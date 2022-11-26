package exercicios;

/*  
 * 2. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
 *  funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse
 *  funcionário.
 */

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o valor do salário minimo: ");
		float salarioMin = teclado.nextFloat();

		System.out.print("Informe o valor do salário do funcionário: ");
		float salarioFun = teclado.nextFloat();

		float qtdSalarios = salarioFun / salarioMin;

		System.out.printf("O funcionário recebe: %.1f salários minimos!", qtdSalarios);
	}
}
