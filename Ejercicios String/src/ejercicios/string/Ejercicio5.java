import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe una frase en min�scula");
		String frase=lector.nextLine();
		System.out.println(frase.toUpperCase());
	}
}
