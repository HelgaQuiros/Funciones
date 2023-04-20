import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class EjemploFunciones {
	
	public static int contarLineasFichero(String ruta) {
		
		int lineas = 0;
		try {
			Scanner lectura = new Scanner(new File(ruta));
			while (lectura.hasNextLine()) {
				lineas++;
				lectura.nextLine(); // Se consume una línea para pasar a siguiente
			}
			lectura.close(); // Cerrar fichero para liberar recursos

			System.out.println("El fichero tiene " + lineas + " líneas.");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // Imprime traza excepción
		}
		
		return lineas;
		
	}

	public static String [] leerFicheroArray(String ruta) {
		// Se lee un fichero y se almacena cada línea del mismo en un array de String

				String datos[] = {}; // Para almacenar cada fila del fichero ¿tamaño?

				// Se van a contar las líneas del fichero
				int lineas = contarLineasFichero(ruta);
				// ya sabemos las que tiene. Se inicializa el array
				datos = new String[lineas];
				try {
					// Vamos a leerlas y guardarlas en el array		
					Scanner lectura = new Scanner(new File(ruta));
					for (int i=0; i< datos.length; i++) {
						datos[i] = lectura.nextLine();
					}
					lectura.close(); // Cerrar fichero para liberar recursos

				} catch (FileNotFoundException e) {
					e.printStackTrace(); // Imprime traza excepción
				}		
		
		return datos;

	}

	public static void main(String[] args) {

		// Prueba: Lectra de un fichero en un array
		//System.out.println("\n---------- Prueba 3 ----------");
		
		String datosLeidos[]=leerFicheroArray("frases.txt");
		// Se pinta el contenido del array para validar que todo está OK
		for (int i=0; i< datosLeidos.length; i++) {
			System.out.println("Línea " + (i+1) + " : " + datosLeidos[i]);
		}

	}

}
