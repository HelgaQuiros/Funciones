
public class Funciones {

	public static void saludar () {
		System.out.println("Hola Mundo");
	}

	public static String devuelveSaludo() {
		return "Hola!";		
	}

	public static String saludarNombre(String nombre) {
		return "Buenos días " + nombre + "!";		
	}

	public static double suma (double a, double b) {
		return a + b;

	}

	public static double sumaArray(double [] array) {
		double sumatoria=0;
		for (int i=0; i<array.length; i++) {
			//sumatoria += array[i];
			sumatoria = suma(sumatoria, array[i]);
		}
		return sumatoria;
	}
	
	public static double mediaArray(double [] array) {
		double sumatoria=0;
		for (int i=0; i<array.length; i++) {
			//sumatoria += array[i];
			sumatoria = suma(sumatoria, array[i]);
		}
		return sumatoria/array.length;
		//return sumaArray(array)/array.length;
	}
	
	public static void imprimirArray(double [] array) {
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 	
		/*
		saludar();
		saludar();
		saludar();
		System.out.println("resultado: " + saludarNombre("Helga"));
		double valor = 23;

		//double resultado = suma(valor, 10);
		double resultado = suma(valor, suma(20,-5));
		 */
		

		double calificaciones []= {7.5, 8, 10, 6.2, 3.5};
		imprimirArray(calificaciones);
		double resultadoSuma = sumaArray(calificaciones);
		double resultadoMedia = mediaArray(calificaciones);

		System.out.println("resultado= " + resultadoSuma);
		System.out.println("resultado= " + resultadoMedia);

	}

}
