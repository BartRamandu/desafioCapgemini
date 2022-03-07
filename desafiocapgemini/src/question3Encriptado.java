import java.util.Scanner;

public class question3Encriptado {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		
		String frase = "Nada se cria onde tudo se copia";
		
		int totalLetras = frase.replace(" ","").length();
		
		System.out.println(totalLetras);

		double grid = Math.sqrt(totalLetras);
		
		
	}

	public static void space() {
		System.out.println();
	}
}
