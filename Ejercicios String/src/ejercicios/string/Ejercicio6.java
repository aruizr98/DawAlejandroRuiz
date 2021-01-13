import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase=lector.nextLine();
		System.out.println("Ahora introduce el número de caracteres de esa frase que quieres mostrar");
		int numero=lector.nextInt();
		
		System.out.println(frase.substring(0, numero));
		
		
	}
}
