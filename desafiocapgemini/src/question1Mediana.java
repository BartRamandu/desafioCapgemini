import java.util.Scanner;
import java.util.Arrays;


public class question1Mediana {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int quantidade;
		
		//Aqui se pede a quantidade de n�meros a se digitar e especifica
		//alguns crit�rios, esse n�mero ser� usado como tamanho do vetor.
		System.out.println("Indique quantos n�meros voc� quer digitar (�mpar/quantidade maior ou igual a 3): ");
		quantidade = numero.nextInt();
		space();
		
		int []numerosDigitados = new int[quantidade];
		
		//Aqui ser� solicitado que se digite os n�meros na quantidade desejada e
		//o la�o for ir� introduzir estes n�meros nos vetores ordenadamente em quest�o.
		System.out.printf("Seja bem vindo(a)! Digite a seguir uma sequ�ncia de %d n�meros inteiros!",quantidade);
		space();
		for (int x = 0; x < numerosDigitados.length; x++) {
			System.out.print("Digite o "+ (x+1) +"� n�mero desejado: ");
			numerosDigitados[x] = (numero.nextInt());
		}
		
		//M�todo que ir� ordenar os n�meros da lista em ordem crescente.
		Arrays.sort(numerosDigitados);
		
		//O la�o for vai mostrar a lista dos n�meros digitados em ordem crescente.
		space();
		System.out.print("Ordem crescente dos n�meros digitados: ");
		for (int y = 0; y < numerosDigitados.length; y++) {
			System.out.print(numerosDigitados[y] + " ");
		}
		
		//A divis�o do inteiro impar em Java arredonda para baixo, caindo
		//exatamente no vetor da mediana.
		space();
		space();
		int mediana = quantidade/2;
		System.out.print("O n�mero na mediana � " + numerosDigitados[mediana]);
	
	}
	
	//Fun��o para dar espa�os em linha sem dar muito trabalho.
	public static void space() {
		System.out.println();
	}

}
