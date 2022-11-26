package exercicios;
/* 
 * 5. Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do
 * primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
 * portanto não é necessário se preocupar com validações.
 * Resultado esperado:
 * OBS: Para forçar uma divisão de dois números inteiro produzir um resultado fracionário,
 * utilizamos a palavra float entre parênteses. Exemplo: (a/(float)b). Neste caso, forçamos o
 * compilador entender que a variavel b apesar de ser inteira deve ser convertida para float.
 */

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor 1: ");
		int valor1 = entrada.nextInt();

		System.out.print("Informe o valor 2: ");
		int valor2 = entrada.nextInt();

		float divisao = valor1 / (float) valor2;
		System.out.printf("A divisão de %d por %d é: %.2f", valor1, valor2, divisao);
	}
}