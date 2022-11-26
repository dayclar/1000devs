package questões;
/*
 * Desenvolva um algoritmo que leia 5 compras de clientes. Para cada compra de cliente deve ser informado o valor da compra e o código da forma de pagamento. Com base neste código, o algoritmo deverá calcular e imprimir o valor a pagar final, a forma de pagamento e o valor de cada parcela, se for o caso.
 * 
 * Lista de códigos e suas respectivas classificações:
 *
 * Código Classificação
 * 1 À vista, com 8% de desconto
 * 2 À vista no cartão, 4% de desconto
 * 3 Em 2x, preço normal sem juros
 * 4 Em 4x, preço acrescido de 8%
 *
 * Qualquer outro código: Opção inválida
 *
 * O algoritmo deve também exibir a soma de todas as compras "À vista" e "Parceladas". Deve ser impresso também o total de descontos e o total de juros.
 *
 * Ex:
 * Compra 01
 * Digite o valor total: R$ 2500.30
 * Digite a forma de pagamento: 1
 * Desconto de 8% 
 * Valor final: R$ 2300.28 
 *
 * Compra 02
 * Digite o valor total: R$ 500.98
 * Digite a forma de pagamento: 2
 * Desconto de 4%
 * Valor final: R$ 480,94
 * 
 * Compra 03
 * Digite o valor total: R$ 10.38
 * Digite a forma de pagamento: 9
 * Opção inválida, a compra não será processada
 *
 * Compra 04
 * Digite o valor total: R$ 40.60
 * Digite a forma de pagamento: 3
 * Em 2x de R$ 20.30
 * Valor final: R$ 40.60
 * 
 * Compra 05
 * Digite o valor total: R$ 140.70
 * Digite a forma de pagamento: 4
 * Em 4x de R$ 37.99
 * Valor final: R$ 151,96 
 *
 * Total de compras "À vista": R$ 2781.22 
 * Total de compras "parceladas": R$ 192.56
 * 
 * Total de descontos: R$ 220.06
 * Total de Juros: R$ 11.26 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão04 {
	public static void main(String[] args) {
		float vlTotal, vlFinal, parcelado2x, acresc8, parcelado4x, compraAvista = 0, compraParcl = 0, descFinal,
				totaldesc = 0, totalJuros = 0;
		int FormaPag, contador;
		Scanner entrada = new Scanner(System.in);
		for (contador = 0; contador < 5; contador++) {
			System.out.print("============= Seja bem vindo a central de compras =============");
			System.out.print("\n\nCódigos de Classificação: \n" + "1 À vista, com 8% de desconto\n"
					+ "2 À vista no cartão, 4% de desconto\n" + "3 Em 2x, preço normal sem juros\n"
					+ "4 Em 4x, preço acrescido de 8%");
			System.out.print("\n\nPreencha as informações abaixo para a compra: ");
			do {
				System.out.print("\nDigite o valor total: ");
				try {
					vlTotal = entrada.nextFloat();
					break;
				} catch (InputMismatchException erro) {
					System.out.print("O valor precisa ser numérico...\n");
					entrada.nextLine();
				}
			} while (true);
			do {
				System.out.print("Digite a forma de pagamento: ");
				try {
					FormaPag = entrada.nextInt();
					break;
				} catch (InputMismatchException erro) {
					System.out.print("O valor precisa ser numérico...\n");
					entrada.nextLine();
				}
			} while (true);

			if (FormaPag == 1) {
				vlFinal = vlTotal - (vlTotal * 0.08f);
				compraAvista += vlFinal;
				totaldesc += (vlTotal * 0.08f);
				System.out.printf("Desconto de 8%%\nValor final: R$ %.2f\n\n", vlFinal);
			} else if (FormaPag == 2) {
				vlFinal = vlTotal - (vlTotal * 0.04f);
				compraAvista += vlFinal;
				totaldesc += (vlTotal * 0.04f);
				System.out.printf("Desconto de 4%%\nValor final: R$ %.2f\n\n", vlFinal);
			} else if (FormaPag == 3) {
				parcelado2x = vlTotal / 2;
				compraParcl += vlTotal;
				System.out.printf("Em 2x de R$ %.2f\nValor final: R$ %.2f\n\n", parcelado2x, vlTotal);
			} else if (FormaPag == 4) {
				acresc8 = vlTotal + (vlTotal * 0.08f);
				parcelado4x = acresc8 / 4;
				compraParcl += acresc8;
				totalJuros += (vlTotal * 0.08f);
				System.out.printf("Em 4x de R$ %.2f\nValor final: R$ %.2f\n\n", parcelado4x, acresc8);
			} else {
				System.out.print("Opção inválida, a compra não será processada.\n\n");
			}
		}
		System.out.printf("\nTotal de compras Á vista: R$ %.2f\nTotal de compras parceladas: R$ %.2f", compraAvista,
				compraParcl);
		System.out.printf("\n\nTotal de descontos: R$ %.2f\nTotal de juros: %.2f", totaldesc, totalJuros);
	}

}