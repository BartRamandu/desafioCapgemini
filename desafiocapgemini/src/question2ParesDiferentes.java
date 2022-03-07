import java.util.Arrays;
import java.util.Scanner;

public class question2ParesDiferentes {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int quantidade;
		int diferenca;
		int contador = 0;
		
		System.out.print("Seja bem vinda(o)! De 3 a 12, quantos n�meros voc� quer inserir? ");
		quantidade = numero.nextInt();
		space();
		
		System.out.print("Quanto voc� deseja que seja a diferen�a depois c�lculada entre eles? ");
		diferenca = numero.nextInt();
		space();
		
		int []numerosDigitados = new int[quantidade];
		
		for (int a = 0; a < numerosDigitados.length; a++) {
			System.out.print("Digite o " + (a+1) + "� n�mero desejado: ");
			numerosDigitados[a] = (numero.nextInt());
		}
		space();
				
		Arrays.sort(numerosDigitados);
		
		int n = numerosDigitados.length;
		for (int j = n; j > 0; j--) {
			for (int i = 0; i < numerosDigitados.length; i++) {
				if (numerosDigitados[j-1]-numerosDigitados[i]==diferenca) {
					contador = contador + 1;
				}
			}
		}
		
		System.out.print("O n�mero de pares com diferen�a de "+ diferenca +" s�o de "+ contador);

	}

	public static void space() {
		System.out.println();
	}
	
}
