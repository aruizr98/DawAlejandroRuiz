import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe una frase en minúscula");
		String frase=lector.nextLine();
		System.out.println(frase.toUpperCase());
	}
}
