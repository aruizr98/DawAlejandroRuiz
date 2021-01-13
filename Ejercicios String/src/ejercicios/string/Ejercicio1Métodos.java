import java.io.IOException;
import java.util.Scanner;
public class Ejercicio1Métodos {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		int numero;
		String frase, frase1, frase2;
		char letra;
		
		do {
		System.out.println("Men� Principal");
		System.out.println("Introduce un n�mero para seleccionar");
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
			System.out.println("El m�todo CharAt devuelve el car�cter de una posici�n indicada");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora introduce un n�mero para ver qu� letra se corresponde con esa posici�n");
			int posicion=lector.nextInt();
			letra=frase.charAt(posicion-1);
			System.out.println("En la posici�n "+posicion+" se encuentra la letra "+letra);
			break;
		case 2:
			System.out.println("El m�todo concat sirve para concatenar varios Strings");
			System.out.println("Escribe una frase");
			frase1=lector.nextLine();
			System.out.println("Ahora escribe otra frase");
			frase2=lector.nextLine();
			System.out.println(frase1.concat(" "+frase2));
			break;
		case 3:
			System.out.println("El m�todo IndexOf sirve para buscar la posici�n en la que se encuentra una letra en una frase");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora escribe la letra que quieras para saber en qu� posici�n se encuentra");
			letra= (char)(System.in.read());
			System.out.println("La letra "+letra+" se encuentra en la posici�n "+(frase.indexOf(letra)+1));
			break;
		case 4:
			System.out.println("El m�todo CompareTo compara 2 Strings y devuelve un 0 si son iguales, un <1 si es menor o un >1 si es mayor siguiendo el abecedario");
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
			System.out.println("El m�todo replace sirve para reemplazar una caracter por otro dentro de un String");
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
			System.out.println("El m�todo lastIndexOf devuelve la �ltima ocurrencia de un caracter o cadena de caracteres dentro de una frase");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora escribe una letra o una palabra que quieras buscar en la frase");
			String busqueda=lector.nextLine();
			int resultado=frase.lastIndexOf(busqueda);
			if(resultado==-1) {
				System.out.println("Sin coincidencias");
			}else {
				System.out.println("La busqueda est� en la posici�n "+(resultado+1));
			}
			break;
		case 7:
			System.out.println("El m�todo length devuelve el tama�o de un String");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("El tama�o de la frase es de: "+frase.length());
			break;
		case 8:
			System.out.println("El m�todo substring devuelve la cadena de car�cteres desde la posici�n de inicio introducida hasta el final o hasta la posici�n de final introducida");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Ahora introduce la posici�n a partir de la cual quieres mostrar la frase");
			int inicio=lector.nextInt();
			System.out.println("Introduce la posici�n m�xima para mostrar la frase");
			int fin=lector.nextInt();
			System.out.println(frase.substring(inicio, fin));
			break;
		case 9:
			System.out.println("Los m�todos toLowerCase y toUpperCase sirven para pasar una frase a min�scula o may�scula");
			System.out.println("Escribe una frase");
			frase=lector.nextLine();
			System.out.println("Pulsa 1 para pasarla a min�scula o 2 para pasarla a may�scula");
			numero=lector.nextInt();
			switch(numero) {
			case 1:
				System.out.println(frase.toLowerCase());
				break;
			case 2:
				System.out.println(frase.toUpperCase());
				break;
				
			default: 
				System.out.println("Introduce el n�mero 1 o el n�mero 2");
			}
			break;
		case 10:
			System.out.println("El m�todo trim devuelve una frase sin espacios ni por delante ni por detr�s");
			System.out.println("Escribe una frase con espacios por delante y/o por detr�s");
			frase=lector.nextLine();
			System.out.println(frase.trim());
		case 11:
			System.out.println("�Hasta pronto!");
			break;
		default:
			System.out.println("Por favor, introduce un n�mero entre 1 y 11 para seleccionar");
		}
		}while(numero!=11);
		}
	}
