package questões;
/*
 * Escreva um algoritmo para criar uma votação para síndico de um prédio. Deve ser lido 5 votos. 
 * Os candidatos são "Candidato A", "Candidato B", "Candidato C". O algoritmo deve exibir um menu com 
 * as opções conforme abaixo: "1 - Candidato A", "2 - Candidato B", "3 - Candidato C", "4 - Voto Nulo". 
 * O algoritmo deve apresentar a quantidade percentual de votos válidos, o percentual de 
 * cada candidato (apenas votos válidos, desconsiderando os votos nulos). 
 * Ao final o algoritmo deve imprimir o candidato vencedor.
 * 
 * Ex:
 * =========== Menu de Votação ===========
 *
 * 1 - Candidato A
 * 2 - Candidato B
 * 3 - Candidato C
 * 4 - Voto Nulo
 *
 * Digite o código do candidato para o primeiro voto: 1
 * Digite o código do candidato para o segundo voto: 1
 * Digite o código do candidato para o terceiro voto: 4
 * Digite o código do candidato para o quarto voto: 2
 * Digite o código do candidato para o quinto voto: 1
 *
 * Percentual de Votos Válidos: 80.0%
 * Percentual de Votos Candidato 1: 60.0%
 * Percentual de Votos Candidato 2: 20.0%
 * Percentual de Votos Candidato 3:  0.0%
 *
 * Candidato vencedor: Candidato 1
 *
 * Para qualquer outro código deve ser exibido: Opção inválida, o voto não será computado.
 * Qualquer exceção no código deve ser tratada com um try catch.
 * Em uma situação real, limparíamos a tela antes de ler o próximo voto, para que o votante atual 
 * não visse o voto anterior. Não precise preocupar com esta situação.
 */ 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int candidatoA = 0;
		int candidatoB = 0;
		int candidatoC = 0;
		int voto = 0;
		int contador = 0;
		int vencedor = 0;
		String nomeVencedor = null;

		while (contador < 5) {
			System.out.print("\n============ Menu de votação ============");
			System.out.print("\n\nEscolha uma Opção: ");
			System.out.print("\n1-Candidato A\n2-Candidato B\n3-Candidato C\n4-Voto Nu"
					+ "lo\n\nDigite o código do candidato para o voto: ");

			try {
				voto = entrada.nextInt();
			} catch (InputMismatchException erro) {
				System.out.print("\nO valor precisa ser numérico...");
				entrada.nextLine();
				voto = 0;
			}

			switch (voto) {
			case 1:
				candidatoA++;
				contador++;
				break;
			case 2:
				candidatoB++;
				contador++;
				break;
			case 3:
				candidatoC++;
				contador++;
				break;
			case 4:
				contador++;
				break;
			default:
				System.out.print("Opção inválida.");
				break;
			}

		}

		if (candidatoA > vencedor) {
			vencedor = candidatoA;
			nomeVencedor = "\nVencedor: Candidato A";
		}
		if (candidatoB > vencedor) {
			vencedor = candidatoB;
			nomeVencedor = "\nVencedor: Candidato B";
		}
		if (candidatoC > vencedor) {
			vencedor = candidatoC;
			nomeVencedor = "\nVencedor: Candidato C";
		}

		if (vencedor == candidatoA && vencedor == candidatoB) {
			nomeVencedor = "\nEmpate entre os candidatos A e B";

		} else if (vencedor == candidatoA && vencedor == candidatoC) {
			nomeVencedor = "\nEmpate entre os candidatos A e C";

		} else if (vencedor == candidatoB && vencedor == candidatoC) {
			nomeVencedor = "\nEmpate entre os candidatos B e C";
		}

		int votosValidos = candidatoA + candidatoB + candidatoC;
		System.out.print("\nPercentual de votos válidos: " + (votosValidos * 20) + "%");
		System.out.print("\nPercentual de votos Candidato A: " + (candidatoA * 20) + "%");
		System.out.print("\nPercentual de votos Candidato B: " + (candidatoB * 20) + "%");
		System.out.print("\nPercentual de votos Candidato C: " + (candidatoC * 20) + "%");
		System.out.print(nomeVencedor);
		entrada.close();
	}

}