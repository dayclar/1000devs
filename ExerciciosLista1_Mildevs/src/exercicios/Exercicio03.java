package exercicios;
/* 
 * 3. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua
 * média ponderada (as notas tem pesos respectivos de 1, 2 e 3). 
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

		System.out.printf("A média ponderada das notas %.1f, %.1f, %.1f é: %.2f", nota1, nota2, nota3, mediaPonderada);
	}
}