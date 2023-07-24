package analise_intervalo_numerico;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um número inteiro que será o ponto inicial do intervalo: %n");
		int intervaloInicial = sc.nextInt();
		System.out.printf("Digite um número inteiro que será o ponto final do intervalo: %n");
		int intervaloFinal = sc.nextInt();
		System.out.printf("Qual a quantidade de números que serão analisados? %n");
		int qtdNumeros = sc.nextInt();
		int numerosDentro = 0;
		int numerosFora = 0;
		int contadorDeInputs = 0;
		
		for (int X = 0; X < qtdNumeros; X++) {
			contadorDeInputs++;
			System.out.println("Digite o " + contadorDeInputs + "º número que será analisado:");
			int numerosAnalisados = sc.nextInt();
			if (numerosAnalisados >= intervaloInicial && numerosAnalisados <= intervaloFinal) {
				numerosDentro += 1;
			}else {
				numerosFora += 1;
			}
		}
		
		System.out.println("O intervalo tem início no número: " + intervaloInicial + " e final no número: " + intervaloFinal);
		System.out.println("A quantiade de números analisados foi de: " + qtdNumeros);
		System.out.println("A quantidade de números dentro do intervalo é de: " + numerosDentro);
		System.out.println("A quantidade de números fora do intervalo é de: " + numerosFora);

	}

}
