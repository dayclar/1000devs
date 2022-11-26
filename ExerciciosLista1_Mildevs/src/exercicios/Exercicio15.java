package exercicios;
/*
 * 15. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, R$15,00 por hora
 * extra e R$ 90 reais por cada dependente menor que 6 anos. Faça um algoritmo que
 * solicite a quantidade de horas normais e extras trabalhadas no mês além da quantidade
 * de dependentes menores que 6 anos. Considere que o salário líquido é igual ao salário de
 * horas normais descontando-se 11% de impostos. O salário final é o salário liquido mais o
 * valor recebido por cada dependente mais as horas extras.
 */

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a quantidade total de horas normais: ");
		float qtdHnormais = teclado.nextFloat();

		System.out.print("Digite a quantidade total de horas extras: ");
		float qtdHExtras = teclado.nextFloat();

		System.out.print("Digite a quantidade total de dependentes menores de 6 anos: ");
		float qtdDepend = teclado.nextFloat();

		float sHNormais = 10 * qtdHnormais;
		float hExtras = 15 * qtdHExtras;
		float aDependent = 90 * qtdDepend;
		float salarioLiq = sHNormais - (sHNormais * 0.11f);
		float salarioFin = salarioLiq + aDependent + hExtras;

		System.out.printf("\nHoras Nomais: R$ %.2f", sHNormais);
		System.out.printf("\nAdicional de Horas Extras: R$ %.2f", hExtras);
		System.out.printf("\nAdicional de Dependentes: R$ %.2f", aDependent);
		System.out.printf("\nSalário Liquido(Hrs normais - Desconto: R$ %.2f", salarioLiq);
		System.out.printf("\nSalário Final: R$ %.2f", salarioFin);

	}
}