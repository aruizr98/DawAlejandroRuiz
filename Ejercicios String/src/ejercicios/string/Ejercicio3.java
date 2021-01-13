import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		int numero;
		String frase, frase1, frase2;
		char letra;
		
		do {
		System.out.println("Menú Principal");
		System.out.println("Introduce un número para seleccionar");
		System.out.println("1. charAt");
		System.out.println("2. concat");
		System.out.println("3. indexOf");
		System.out.println("4. compareTo");
		System.out.println("5. replace");
		System.out.println("6. lastIndexOf");
		System.out.println("7. length");
		System.out.println("8.subString");
		System.out.println("9. toLowerCase / toUpperCase");
		System.out.println("10. trim");
		System.out.println("11.Salir");
		
		
		numero=lector.nextInt();
		lector.nextLine();
		
		switch(numero) {
		case 1:
			System.out.println("El método CharAt devuelve el carácter de una posición indicada");
			System.out.println("Escribe una frase");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ahora introduce un número para ver qué letra se corresponde con esa posición");
			int posicion=lector.nextInt();
			letra=((CharSequence) bf).charAt(posicion-1);
			System.out.println("En la posición "+posicion+" se encuentra la letra "+letra);
			break;
		case 2:
			System.out.println("El método concat sirve para concatenar varios Strings");
			System.out.println("Escribe una frase");
			frase1=lector.nextLine();
			System.out.println("Ahora escribe otra frase");
			frase2=lector.nextLine();
			System.out.println(frase1.concat(" "+frase2));
			break;
		case 3:
			System.out.println("El método IndexOf sirve para buscar la posición en la que se encuentra una letra en una frase");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora escribe la letra que quieras para saber en qué posición se encuentra");
			letra= (char)(System.in.read());
			System.out.println("La letra "+letra+" se encuentra en la posición "+(frase.indexOf(letra)+1));
			break;
		case 4:
			System.out.println("El método CompareTo compara 2 Strings y devuelve un 0 si son iguales, un <1 si es menor o un >1 si es mayor siguiendo el abecedario");
			System.out.println("Escribe una frase");
			frase1=lector.nextLine();
			System.out.println("Ahora escribe otra frase");
			frase2=lector.nextLine();
			System.out.println(frase1.compareTo(frase2));
			
			if(frase1.compareTo(frase2)==0) {
				System.out.println("Las frases son iguales");
			}else if(frase1.compareTo(frase2)<1) {
				System.out.println("La primera frase es menor a la segunda");
			}else {
				System.out.println("La primera frase es mayor a la segunda");
			}
			break;
		case 5:
			System.out.println("El método replace sirve para reemplazar una caracter por otro dentro de un String");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora escribe la letra que quieres reemplazar");
			char reemplazada=(char)(System.in.read());
			char espacio=(char)(System.in.read());
			char espacio2=(char)(System.in.read());
			System.out.println("Escribe la letra por la que quieres reemplazar la "+reemplazada);
			char reemplazo=(char)(System.in.read());
			System.out.println("La frase con las letras reemplazadas es: "+frase.replace(reemplazada, reemplazo));
			break;
		case 6:
			System.out.println("El método lastIndexOf devuelve la última ocurrencia de un caracter o cadena de caracteres dentro de una frase");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora escribe una letra o una palabra que quieras buscar en la frase");
			String busqueda=lector.nextLine();
			int resultado=frase.lastIndexOf(busqueda);
			if(resultado==-1) {
				System.out.println("Sin coincidencias");
			}else {
				System.out.println("La busqueda está en la posición "+(resultado+1));
			}
			break;
		case 7:
			System.out.println("El método length devuelve el tamaó de un String");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("El tamaño de la frase es de: "+frase.length());
			break;
		case 8:
			System.out.println("El método substring devuelve la cadena de carácteres desde la posición de inicio introducida hasta el final o hasta la posición de final introducida");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora introduce la posición a partir de la cual quieres mostrar la frase");
			int inicio=lector.nextInt();
			System.out.println("Introduce la posición máxima para mostrar la frase");
			int fin=lector.nextInt();
			System.out.println(frase.substring(inicio, fin));
			break;
		case 9:
			System.out.println("Los métodos toLowerCase y toUpperCase sirven para pasar una frase a minúscula o mayúscula");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Pulsa 1 para pasarla a minúscula o 2 para pasarla a mayúscula");
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				System.out.println(frase.toLowerCase());
				break;
			case 2:
				System.out.println(frase.toUpperCase());
				
			default: 
				System.out.println("Introduce el número 1 o el número 2");
			}
			break;
		case 10:
			System.out.println("El método trim devuelve una frase sin espacios ni por delante ni por detrás");
			System.out.println("Escribe una frase con espacios por delante y/o por detrás");
			frase=lector.nextLine();
			System.out.println(frase.trim());
		}
		}while(numero!=11);
		System.out.println("¡Hasta Pronto!");
		}
	}