import java.util.Scanner;
import java.util.Arrays;


public class question1Mediana {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int quantidade;
		
		//Aqui se pede a quantidade de números a se digitar e especifica
		//alguns critérios, esse número será usado como tamanho do vetor.
		System.out.println("Indique quantos números você quer digitar (ímpar/quantidade maior ou igual a 3): ");
		quantidade = numero.nextInt();
		space();
		
		int []numerosDigitados = new int[quantidade];
		
		//Aqui será solicitado que se digite os números na quantidade desejada e
		//o laço for irá introduzir estes números nos vetores ordenadamente em questão.
		System.out.printf("Seja bem vindo(a)! Digite a seguir uma sequência de %d números inteiros!",quantidade);
		space();
		for (int x = 0; x < numerosDigitados.length; x++) {
			System.out.print("Digite o "+ (x+1) +"º número desejado: ");
			numerosDigitados[x] = (numero.nextInt());
		}
		
		//Método que irá ordenar os números da lista em ordem crescente.
		Arrays.sort(numerosDigitados);
		
		//O laço for vai mostrar a lista dos números digitados em ordem crescente.
		space();
		System.out.print("Ordem crescente dos números digitados: ");
		for (int y = 0; y < numerosDigitados.length; y++) {
			System.out.print(numerosDigitados[y] + " ");
		}
		
		//A divisão do inteiro impar em Java arredonda para baixo, caindo
		//exatamente no vetor da mediana.
		space();
		space();
		int mediana = quantidade/2;
		System.out.print("O número na mediana é " + numerosDigitados[mediana]);
	
	}
	
	//Função para dar espaços em linha sem dar muito trabalho.
	public static void space() {
		System.out.println();
	}

}
