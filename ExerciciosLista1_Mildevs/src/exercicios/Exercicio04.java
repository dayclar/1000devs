package exercicios;

/*
 *  4. Faça um algoritmo que calcule e mostre a tabuada de (+, -, * e /) de um número
 * digitado pelo usuário. 
 * OBS: Quando se calcula em uma substração um numero menor de um número maior (ex:
 * 3 - 10) o resultado será um número negativo. Pesquise como desprezar o sinal negatio
 * para sempre termos um número positivo. 
 */
 
 import java.util.Scanner;
 import java.lang.Math;
 
public class Exercicio04 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número para o calculo da tabuada:\n");
        int numero = entrada.nextInt();

        calculaSomaSub(numero,0);
        calculaSomaSub(numero,1);
        calculaSomaSub(numero,2);
        calculaSomaSub(numero,3);
        calculaSomaSub(numero,4);
        calculaSomaSub(numero,5);
        calculaSomaSub(numero,6);
        calculaSomaSub(numero,7);
        calculaSomaSub(numero,8);
        calculaSomaSub(numero,9);
        System.out.println();

        calculaMultDiv(numero,0);
        calculaMultDiv(numero,1);
        calculaMultDiv(numero,2);
        calculaMultDiv(numero,3);
        calculaMultDiv(numero,4);
        calculaMultDiv(numero,5);
        calculaMultDiv(numero,6);
        calculaMultDiv(numero,7);
        calculaMultDiv(numero,8);
        calculaMultDiv(numero,9);

    }

    public static void calculaSomaSub(int valor1, int valor2){
        int resultadoSoma = valor1 + valor2;
        int resultadoSub = Math.abs(valor1 - valor2);

        System.out.print(valor1 + " + " + valor2 + " = " + resultadoSoma);
        System.out.println("\t\t" + valor1 + " - " + valor2 + " = " + resultadoSub);
    }
    public static void calculaMultDiv(int valor1, int valor2){
        int resultadoMult = valor1*valor2;
        int resultadoDiv = 0;
        System.out.print(valor1 + " * " + valor2 + " = " + resultadoMult);
        if(valor2 == 0) {
            System.out.println("\t\tNão existe divisão por 0");
        }else {
            resultadoDiv = Math.abs(valor1/valor2);
            System.out.println("\t\t" + valor1 + " / " + valor2 + " = " + resultadoDiv);
        }
    }
}