package exercicios;
/*
 * 13. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350
 * ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada
 * quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0");

		System.out.print("Digite a quantidade de latas de 450 ml: ");
		float qtd350ml = entrada.nextFloat();

		System.out.print("Digite a quantidade de garrafas de 600 ml: ");
		float qtd600ml = entrada.nextFloat();

		System.out.print("Digite a quantidade de garrafas de 2 lts: ");
		float qtd2lts = entrada.nextFloat();

		float total350ml = (qtd350ml * 350) / 1000;
		float total600ml = (qtd600ml * 600) / 1000;
		float total2lts = qtd2lts * 2;
		float totalLts = total350ml + total600ml + total2lts;

		System.out.print("\nA quantidade total de litros é: " + format.format(totalLts));

	}
}