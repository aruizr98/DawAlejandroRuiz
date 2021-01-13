import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjemploStrintg {
	public static void main (String [] args) throws IOException {
		String cadena = new String("cASIta");
		Scanner lector = new Scanner(System.in);
		System.out.println(cadena.compareTo("casa"));
		
		System.out.println(cadena.equals("casita"));
		System.out.println(cadena.equalsIgnoreCase("casita"));
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena);
		System.out.println(cadena.charAt(3));
		int resultado = cadena.indexOf('H');
		if (resultado==-1)
			System.out.println("No está la j en la cadena");
		else
			System.out.println("Está en la posicion " + (resultado+1));
		System.out.println(cadena.lastIndexOf('o'));
		char palabra[] = cadena.toCharArray();
		char palabra2[] = new char[cadena.length()];
		System.out.println(palabra.length);
		System.out.println(cadena.length());
		cadena = "Hasta mañana ";
		System.out.println(cadena.length());
		System.out.println("Introduce tu nombre");
		//String nombre = lector.next();
		String nombre = lector.nextLine();
		System.out.println(cadena.concat(" "+nombre));
		String palabraChar = lector.next();
		char letra = palabraChar.charAt(0);
		System.out.println(letra);
		cadena = cadena.replace("mañana", "la vuelta de Navidad");
		System.out.println(cadena);
		System.out.println(cadena.substring(0,5));
		System.out.println("Introduce codigo postal");
		int codigo = lector.nextInt();
		String codigoPostal = String.valueOf(codigo);
		String dos = codigoPostal.substring(0,2);
		if (dos.equals("28"))
			System.out.println("Es de Madrid");
		else
			System.out.println("No es de Madrid");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cuántos años tienes?");
		String cadena2 =bf.readLine();
		double edad = Double.parseDouble(cadena2);
		System.out.println("El año que viene tendrás " + (edad+1)+ " años.");
	}
}
