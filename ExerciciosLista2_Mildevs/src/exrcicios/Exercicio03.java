package exrcicios;
/*
 * Questão 03: Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a
 * sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). Calcule o valor das notas com
 * base em seus pesos e além de apresentar a média, exiba a maior nota entre as 3 notas, ou a
 * mensagem “As 3 notas são iguais”, ou “As notas 1 e 2 são as maiores”, “As notas 1 e 3 são as
 * maiores”, “As notas 2 e 3 são as maiores” caso exista duas notas iguais e elas sejam as maiores.
 */
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Informe a nota 2: ");
		float nota2 = entrada.nextFloat();

		System.out.print("Informe a nota 3: ");
		float nota3 = entrada.nextFloat();

		float mediaPonderada = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / (1 + 2 + 3);

		float pesoNota1 = nota1 * 1;
		float pesoNota2 = nota2 * 2;
		float pesoNota3 = nota3 * 3;

		System.out.printf("\nA média ponderada das notas %.1f, %.1f e %.1f é: %.2f", nota1, nota2, nota3,
				mediaPonderada);

		if (pesoNota3 > pesoNota1 && pesoNota3 > pesoNota2) {
			System.out.printf("\nA nota 3(%.2f) é maior nota após o calculo do peso 3(%.2f).", nota3, pesoNota3);
		} else if (pesoNota2 > pesoNota1 && pesoNota2 > pesoNota3) {
			System.out.printf("\nA nota 2(%.2f) é maior nota após o calculo do peso 2(%.2f).", nota2, pesoNota2);
		} else if (pesoNota1 > pesoNota2 && pesoNota1 > pesoNota3) {
			System.out.printf("\nA nota 1(%.2f) é maior nota após o calculo do peso 1(%.2f).", nota1, pesoNota1);
		} else if (pesoNota1 > pesoNota3 && pesoNota2 > pesoNota3) {
			System.out.printf("\nAs notas 1(%.2f) e 2(%.2f) foram as maiores notas após o cal"
					+ "culo do peso 1(%.2f) e peso 2(%.2f).", nota1, nota2, pesoNota1, pesoNota2);
		} else if (pesoNota1 > pesoNota2 && pesoNota3 > pesoNota2) {
			System.out.printf("\nAs notas 1(%.2f) e 3(%.2f) foram as maiores notas após o cal"
					+ "culo do peso 1(%.2f) e peso 3(%.2f).", nota1, nota3, pesoNota1, pesoNota3);
		} else if (pesoNota2 > pesoNota1 && pesoNota3 > pesoNota1) {
			System.out.printf("\nAs notas 2(%.2f) e 3(%.2f) foram as maiores notas após o cal"
					+ "culo do peso 2(%.2f) e peso 3(%.2f).", nota2, nota3, pesoNota2, pesoNota3);
		} else if (pesoNota1 == pesoNota2 && pesoNota1 == pesoNota3 && pesoNota2 == pesoNota3) {
			System.out.printf("\nAs três notas foram iguais.", nota1, nota2, nota3, mediaPonderada);
		}
	}

}