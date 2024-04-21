
import java.util.Scanner;


public class Parcial_1 {

	public static void main (String[] args) {
		

	      //declarar e inicializar un arreglo de más de 20 elementos
	      //debe llenar el arreglo con enteros de forma aleatoria o pedirlos por consola
	      //debe recorrer el arreglo y extraer aquellos elementos duplicados (o que estén más de 2 veces), en un arreglo aparte llamado "repetidos"

	      
	      Scanner scanner = new Scanner(System.in);
	      // Definir el tamaño del arreglo
	     int arr = 30;
	      int[] arreglo = new int[arr];

	      // Llenar el arreglo con valores ingresados por el usuario
	      System.out.println("Por favor ingresa " + arr + " números:");

	      for (int i = 0; i < arr; i++) {
	          System.out.print("Ingrese el número para la posición " + i + ": ");
	          arreglo[i] = scanner.nextInt();
	      }

	     

	      // Mostrar elementos duplicados
	          System.out.println("\nlos números duplicados son:");
	          for (int i = 0; i < arreglo.length; i++) {
	              if (count(arreglo, arreglo[i]) > 1) {
	                  System.out.print(arreglo[i] + " ");
	              }
	          }
	      }

	      public static int count (int[] arr, int n) {
	          int count = 0;
	          for (int item : arr) {
	              if (item == n) {
	                  count++;
	              }
	          }
	      
	      
	      return count;
	       
		
		
		
	}
	
	
	
}
