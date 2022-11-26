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

public class Exercicio16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do faturamento anterior: ");
		float faturamAnt = entrada.nextFloat();

		float meta = faturamAnt * 1.2f;
		float aumento = faturamAnt * 0.2f;
		float qtdProd1 = aumento / 150;
		float qtdProd2 = aumento / 220;
		float qtdProd3 = aumento / 97;

		System.out.printf("\nA meta do proximo mês é: R$ %.2f\nUm aumento de: R$ %.2f\n", meta, aumento);
		System.out.printf("\nQuantidade de peças a mais a serem vendidadas para atingirmos a"
				+ " meta:\n\nProduto 1: %.2f\nProduto 2: %.2f\nProduto 3: %.2f", qtdProd1, qtdProd2, qtdProd3);

	}

}