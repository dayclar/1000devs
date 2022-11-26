package exercicios;
/*
 * 20. Ler um número inteiro com até quatro dígitos e imprimir a saída da seguinte forma:
 * MILHARES = x
 * CENTENA = x
 * DEZENA = x
 * UNIDADE = x
 */

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número de 4 digitos: ");
		Integer numero = teclado.nextInt();

		// Transformando numero em String.
		String numeroString = String.valueOf(numero.toString());

		// Tranformando em char e pegando as posições.
		char milhares = numeroString.charAt(0);
		char centenas = numeroString.charAt(1);
		char dezenas = numeroString.charAt(2);
		char unidades = numeroString.charAt(3);

		// Transformando em inteiro.
		int milharesinteiro = Integer.parseInt(String.valueOf(milhares));

		System.out.print("\nmilhares: " + milhares);
		System.out.print("\ncentenas: " + centenas);
		System.out.print("\ndezenas: " + dezenas);
		System.out.print("\nunidades: " + unidades);
	}
}