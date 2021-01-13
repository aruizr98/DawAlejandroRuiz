import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe una palabra o frase");
		String frase=lector.nextLine();
		StringBuffer frase1=new StringBuffer(frase);
		StringBuffer frase2=new StringBuffer(frase1.reverse());
		String fraseInvertida=new String(frase2);
		
		
		if(frase.compareTo(fraseInvertida)==0) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
	}
}
