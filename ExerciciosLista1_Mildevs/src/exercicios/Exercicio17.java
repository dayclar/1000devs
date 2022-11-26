package exercicios;
/*
 * 17. Uma padaria vende uma certa quantidade de pães franceses e uma quantidade de
 * broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,60. Ao final do dia, o
 * dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve
 * guardar numa conta de poupança (10% do total arrecadado) para realizar uma reforma.
 * Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um
 * algoritmo para ler as quantidades de pães e de broas, o valor da reforma e depois calcule
 * o valor arrecado, o valor a ser depositado na poupança e quantos dias serão necessários,
 * caso mantenha o mesmo faturamento, para custear a reforma.
 * Requisito adicional: A quantidade de dias deve ser retornado como um valor inteiro.
 * Exemplo: 3.78 dias deverá retornar 4 dias
 * 9.2 dias deverá retornar 10 dias
 * 10.89 dias deverá retornar 11 dias
 */

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade diária de pães vendidos: ");
		float qtdpaes = entrada.nextFloat();

		System.out.print("Digite a quantidade diária de broas vendidas: ");
		float qtdbroas = entrada.nextFloat();

		System.out.print("Digite o valor da reforma: ");
		float reforma = entrada.nextFloat();

		float fatupaes = qtdpaes * 0.12f;
		float fatubroas = qtdbroas * 1.6f;
		float paesEbroas = fatupaes + fatubroas;
		float poupanca = paesEbroas * 0.10f;
		float qtddias = reforma / poupanca;

		System.out.printf("\nFaturamento com a venda de broas: %.2f", fatubroas);
		System.out.printf("\nFaturamneto com a venda de pães: %.2f", fatupaes);
		System.out.printf("\nFaturamneto diário(pães + broas): %.2f", paesEbroas);
		System.out.printf("\nValor do deposito na poupança: %.2f", poupanca);
		System.out.printf("\n\nPara pagar a reforma serão necessários: %.0f dias", qtddias);
	}

}