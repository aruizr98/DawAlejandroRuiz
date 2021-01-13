import java.util.Scanner;
public class Ejercicio6Método {
	public static void CaracteresFrase(String frase, int numero) {
		System.out.println(frase.substring(0, numero));
	}
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase=lector.nextLine();
		System.out.println("Ahora introduce cu�ntos car�cteres quieres mostrar");
		int numero=lector.nextInt();
		CaracteresFrase(frase, numero);
		
		
	}
}
