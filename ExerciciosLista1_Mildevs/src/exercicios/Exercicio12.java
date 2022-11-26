package exercicios;
/*
 * 12. A granja Frangotech possui um controle automatizado de cada frango da sua
 * produção. No pé direito do frango há um anel com um chip de identificação; no pé
 * esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
 * que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo
 * para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser
 * informado pelo usuário.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		System.out.print("Digite a Qtd de frangos: ");
		float qtdfrangos = entrada.nextFloat();

		float vlanel = qtdfrangos * 4;
		float vlaliment = qtdfrangos * 7;
		float vlTotal = vlanel + vlaliment;

		System.out.print("O valor total para identificar os frangos é: R$ " + format.format(vlTotal));

	}
}