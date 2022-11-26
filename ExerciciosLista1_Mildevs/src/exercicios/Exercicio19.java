package exercicios;
/*
 * 19. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o
 * início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês
 * possui 30 dias.
 */

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o dia: ");
		int dia = teclado.nextInt();

		System.out.print("Informe o mês: ");
		int mês = teclado.nextInt();

		int totaldias = (mês - 1) * 30 + dia;

		System.out.print("\nA quantidade de dias que se passaram foi: " + totaldias + " dias ");

	}
}