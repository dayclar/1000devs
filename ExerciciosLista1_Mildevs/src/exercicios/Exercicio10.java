package exercicios;
/*
 * 10. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
 * calcule e mostre.
 * a) a idade dessa pessoa em anos;
 * b) a idade dessa pessoa em meses;
 * c) a idade dessa pessoa em dias; considere todos os meses com 30 dias
 * d) a idade dessa pessoa em semanas, considere que todos os messes possuem 4 semanas;
 */
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o ano de nascimento: ");
		int nascim = entrada.nextInt();

		System.out.print("Digite o ano atual: ");
		int anoAtual = entrada.nextInt();

		int idadeAnos = anoAtual - nascim;
		int idadeMeses = idadeAnos * 12;
		int idadeDias = idadeMeses * 30;
		int idadeSema = idadeMeses * 4;

		System.out.printf("\nA idade desta pessoa em anos é: %d\nme" + "ses é: %d\ndias é: %d\nsemanas é: %d",
				idadeAnos, idadeMeses, idadeDias, idadeSema);
	}
}