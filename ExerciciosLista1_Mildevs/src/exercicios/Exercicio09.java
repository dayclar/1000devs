package exercicios;
/*
 * 09. Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
 * Pesquisa na Internet como calculcar a área de cada objeto abaixo:
 * a) de um trapézio.
 * b) de um quadrado.
 * c) de um retangulo.
 * d) de um círculo.
 * e) de um triangulo.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");

		System.out.print("Área do trapézio: ");

		System.out.print("\nInforme o valor da base maior: ");
		float baseMai = entrada.nextFloat();

		System.out.print("Informe o valor da base menor: ");
		float baseMen = entrada.nextFloat();

		System.out.print("Informe o valor da altura: ");
		float alturaTrap = entrada.nextFloat();

		float areatrap = ((baseMai + baseMen) * alturaTrap) / 2;

		System.out.print("A área do trapézio é: " + format.format(areatrap));

		/****************************************************************************************************************/
		System.out.print("\n\nÁrea do quadrado: ");

		System.out.print("\nInforme o valor de um dos lados: ");
		float lado = entrada.nextFloat();

		float areaQuad = lado * 4;

		System.out.print("A área do quadrado é: " + format.format(areaQuad));

		/****************************************************************************************************************/
		System.out.print("\n\nÁrea do retangulo: ");

		System.out.print("\nInforme o valor da largura: ");
		float largura = entrada.nextFloat();

		System.out.print("Informe o valor da altura: ");
		float alturaRetan = entrada.nextFloat();

		float areaRetan = largura * alturaRetan;

		System.out.print("A área do retangulo é: " + format.format(areaRetan));

		/****************************************************************************************************************/
		System.out.print("\n\nÁrea do circulo: ");

		System.out.print("\nInforme o valor do raio: ");
		float raio = entrada.nextFloat();

		float areaCirc = 3.14f * (raio * raio);

		System.out.print("A área do circulo é: " + format.format(areaCirc));

		/***************************************************************************************************************/
		System.out.print("\n\nÁrea do triângulo: ");

		System.out.print("\nInforme o valor da base: ");
		float baseTri = entrada.nextFloat();

		System.out.print("Informe o valor da altura: ");
		float alturaTri = entrada.nextFloat();

		float areaTri = (baseTri * alturaTri) / 2;

		System.out.print("A área do triângulo é: " + format.format(areaTri));
	}
}
