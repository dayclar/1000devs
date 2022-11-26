package exercicios;
/*
 *  8. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o
 *  aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o
 *  aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos
 *  (INSS+FGTS)
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		System.out.print("Informe o salário: ");
		float salario = entrada.nextFloat();

		float salReajust = salario * 1.15f;
		float descontoINSS = salReajust * 0.11f;
		float descontoFGTS = salReajust * 0.08f;
		float iNSSeFGTS = descontoINSS + descontoFGTS;
		float salFinal = salReajust - iNSSeFGTS;

		System.out.print("\nSalario Inicial: R$ " + format.format(salario));
		System.out.print("\nSalario Reajustado: R$ " + format.format(salReajust));
		System.out.print("\nDesconto 11% INSS: R$ " + format.format(descontoINSS));
		System.out.print("\nDesconto 8% FGTS: R$ " + format.format(descontoFGTS));
		System.out.print("\nTotal Descontos INSS+FGTS: R$ " + format.format(iNSSeFGTS));
		System.out.print("\nSalário Final: R$ " + format.format(salFinal));
	}
}
