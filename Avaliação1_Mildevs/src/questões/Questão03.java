package questões;
/*
 * Desenvolva um algoritmo para ler o nome, a idade, o sexo de 03 (três) indivíduos e 
 * imprimir “XXXX é criança”, se a idade for menor ou igual a 13 anos, “XXXX é adolescente”, 
 * no caso de idade estar entre 13 e 20 anos, e “XXX é adulto”, se for até a 
 * idade 50 anos e "XXX é da melhor idade" acima de 50 anos. 
 * XXX deve ser substituído pelo nome do indivíduo. No caso do sexo, 
 * o individuo pode digitar: F, f, m ou M. O algoritmo também deve imprimir 
 * ao final a quantidade de indivíduos que são crianças, adolescentes, adultos e melhor idade.
 *  Deve ser informado também o nome do indivíduo mais Velho. 
 *  Qualquer exceção no código deve ser tratada com um try catch.
 *
 * Ex: 
 * Digite o nome do indivíduo 01: João
 * Digite a idade do João: 26
 * Digite o sexo do(a) João: m
 * João é adulto.
 * 
 * Digite o nome do indivíduo 02: Maria
 * Digite a idade do Maria: 8
 * Digite o sexo do(a) Maria: F
 * Maria é criança.
 *
 * Digite o nome do indivíduo 03: Jose
 * Digite a idade do Jose: 80
 * Digite o sexo do(a) Jose: M
 * Jose é da melhor idade.
 *
 * Total de crianças: 1
 * Total de adolescentes: 0
 * Total de adultos: 1
 * Total de melhor idade: 1
 *
 * O nome do indivíduo mais velho é: Jose
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão03 {
	static String lerNome(int numero) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\nDigite o nome do indivíduo " + numero + ": ");
		String nome1 = entrada.nextLine();
		return nome1;
	}

	static int lerIdade(String nome) {
		Scanner entrada = new Scanner(System.in);
		int idade = 0;
		do {
			System.out.print("Digite a idade de " + nome + ": ");
			try {
				idade = entrada.nextInt();
				break;
			} catch (InputMismatchException erro) {
				System.out.print("O valor precisa ser numérico...\n");
				entrada.nextLine();
			}
		} while (true);
		return idade;
	}

	static String lerOsexo(String nome) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o sexo de " + nome + ": ");
		String sexo = entrada.nextLine();
		return sexo;
	}

	static void imprimirCrianca(String nome) {
		System.out.print(nome + " é criança.");
	}

	static void imprimirAdolescente(String nome) {
		System.out.print(nome + " é adolescente.");
	}

	static void imprimirAdulto(String nome) {
		System.out.print(nome + " é adulto.");
	}

	static void imprimMelhorIdade(String nome) {
		System.out.print(nome + " é da melhor idade.");
	}

	static String mostraNomeMaisV(int idade1, int idade2, int idade3, String nome1, String nome2, String nome3) {
		String nomeMaisV = null;
		int maisVelho = 0;

		if (idade1 > maisVelho) {
			maisVelho = idade1;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome1;
		}
		if (idade2 > maisVelho) {
			maisVelho = idade2;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome2;
		}
		if (idade3 > maisVelho) {
			maisVelho = idade3;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome3;
		}
		return nomeMaisV;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int criança = 0, adolescente = 0, adulto = 0, melhorIdade = 0;
		String nome1, nome2, nome3;
		int idade1, idade2, idade3;
		String sexo1, sexo2, sexo3;
		String nomeMaisV = null;

		nome1 = lerNome(1);
		idade1 = lerIdade(nome1);
		sexo1 = lerOsexo(nome1);

		if (idade1 <= 13) {
			imprimirCrianca(nome1);
			criança++;
		} else if (idade1 >= 13 && idade1 < 21) {
			imprimirAdolescente(nome1);
			adolescente++;
		} else if (idade1 >= 21 && idade1 <= 50) {
			imprimirAdulto(nome1);
			adulto++;
		} else if (idade1 > 50) {
			imprimMelhorIdade(nome1);
			melhorIdade++;
		}
		nome2 = lerNome(2);
		idade2 = lerIdade(nome2);
		sexo2 = lerOsexo(nome2);

		if (idade2 <= 13) {
			imprimirCrianca(nome2);
			criança++;
		} else if (idade2 >= 13 && idade2 < 21) {
			imprimirAdolescente(nome2);
			adolescente++;
		} else if (idade2 >= 21 && idade2 <= 50) {
			imprimirAdulto(nome2);
			adulto++;
		} else if (idade2 > 50) {
			imprimMelhorIdade(nome2);
			melhorIdade++;
		}
		nome3 = lerNome(3);
		idade3 = lerIdade(nome3);
		sexo3 = lerOsexo(nome3);

		if (idade3 <= 13) {
			imprimirCrianca(nome3);
			criança++;
		} else if (idade3 >= 13 && idade3 < 21) {
			imprimirAdolescente(nome3);
			adolescente++;
		} else if (idade3 >= 21 && idade3 <= 50) {
			imprimirAdulto(nome3);
			adulto++;
		} else if (idade3 > 50) {
			imprimMelhorIdade(nome3);
			melhorIdade++;
		}
		nomeMaisV = mostraNomeMaisV(idade1, idade2, idade3, nome1, nome2, nome3);

		System.out.print("\n\nTotal de crianças: " + criança);
		System.out.print("\nTotal de adolescentes: " + adolescente);
		System.out.print("\nTotal de adultos: " + adulto);
		System.out.print("\nTotal melhor idade: " + melhorIdade);
		System.out.print(nomeMaisV);
	}
}