import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
	System.out.println("Introduce el número de palabras que quieres introducir");
	int numero=lector.nextInt();
	
	String palabra[]=new String[numero];
	
	for (int i = 0; i < numero; i++) {
		System.out.println("Introduce la palabra "+(i+1));
		palabra[i]=lector.next();
	}
	for (int i = 0; i < palabra.length-1; i++) {
		if(palabra[i].compareTo(palabra[i+1]) <0 ) {
			System.out.println(palabra[i]+", "+palabra[i+1]);
		}else if(palabra[i].compareTo(palabra[i+1]) >0) {
			System.out.println(palabra[i+1]+", "+palabra[i]);
		}else{
			System.out.println("Las palabras son iguales");
		}
	}
	}
}
