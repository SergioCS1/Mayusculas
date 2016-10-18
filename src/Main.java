import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner teclado=new Scanner(System.in);
			System.out.println("Frase: ");
			String texto = teclado.next();
			
			System.out.println(texto.toUpperCase());

		}

	}
