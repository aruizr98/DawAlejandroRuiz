import java.util.Scanner;
public class Ejercicio5Método {
	public static void mayuscula(String frase) {
		System.out.println(frase.toUpperCase());
	}
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase=lector.nextLine();
		mayuscula(frase);
		
	}
}
