import java.util.Scanner;

public class Ejercicio4Método {
	
	public static void palindromo (String frase) {
		Scanner lector = new Scanner(System.in);
		StringBuffer frase1=new StringBuffer(frase);
		StringBuffer frase2=new StringBuffer(frase1.reverse());
		String fraseInvertida=new String(frase2);
		
		
		if(frase.compareTo(fraseInvertida)==0) {
			System.out.println("Es un pal�ndromo");
		}else {
			System.out.println("No es un pal�ndromo");
		}
		}
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String frase;
		System.out.println("Escribe una frase");
		frase=lector.nextLine();
		palindromo(frase);
	
	}	
}
