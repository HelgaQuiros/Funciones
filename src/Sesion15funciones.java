
public class Sesion15funciones {

	public static void saludar () {
		System.out.println("Hola Mundo!");
	}
	
	public static String devolverSaludo(String nombre) {
		return "Hola! " + nombre;		
	}
	
	public static double suma(double a, double b) {
		return a + b;		
	}
	
	public static double sumaArray(double [] array) {
		double sumatoria=0;
		for (int i=0; i<array.length;i++ ) {
			sumatoria = suma(sumatoria,array[i]);//utilizando la llamada a la función suma
			//sumatoria=sumatoria + array[i]; 
		}
		return sumatoria;		
	}
	
	public static double mediaArray(double [] array) {		
		/*
		double media=0;
		double sumatoria=0;
		
		
		for (int i=0; i<array.length;i++ ) {
			sumatoria = suma(sumatoria,array[i]);//utilizando la llamada a la función suma
			//sumatoria=sumatoria + array[i]; 
		}
		media=sumatoria/array.length;
		*/
		double media=0;
		media=sumaArray(array)/array.length;
		return media;		
	}
	
	public static void imprimirArray(double [] array) {
		System.out.println("array=");
		for (int i=0; i<array.length;i++ ) {			
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] calificaciones = {7.5,6,0,10,8.5,9.5};

		saludar();
		saludar();
		saludar();
		
		String respuesta = devolverSaludo("Helga");
		System.out.println("respuesta= " + respuesta);
		
		double valor = 10;
		System.out.println("sumatoria= " + suma(valor,suma(1,2.5)));
		
		double sumatotal = sumaArray(calificaciones); 
		System.out.println("la suma de calificaciones es = " + sumatotal);
		System.out.println("la media de calificaciones es = " + mediaArray(calificaciones));
		
		imprimirArray(calificaciones);
		
	}

}
