package exercicios;
/*
 *  7. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
 *  a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
 *  b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		System.out.print("Informe o peso em KG: ");
		float peso = entrada.nextFloat();

		float engorde = peso * 1.15f;
		float emagreca = peso - (peso * 0.20f);

		System.out.print("\nCaso a pessoa engorde 15% ficará com: " + format.format(engorde) + " KG ");
		System.out.print("\nCaso a pessoa emagreça 20% ficará com: " + format.format(emagreca) + " KG ");
	}
}