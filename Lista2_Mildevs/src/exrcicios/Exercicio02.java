package exrcicios;

/*
 * Questão 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
 *
 * funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. Caso
 * o funcionário receba menos que 1 salário mínimo deverá ser apresentado a mensagem
 * “Funcionário ganha menos que um salário mínimo”.
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

		if (salarioFun < salarioMin) {
			System.out.print("\nO Funcionário ganha menos que um salário minímo!");
		} else {
			System.out.printf("\nO funcionário recebe: %.1f salários minimos!", qtdSalarios);
		}
	}
}