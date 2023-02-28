import java.util.Scanner;

public class Main 
{
	/**** datos *****/
	
	/* variables */
	static int tablero[][];
	static int ganador;
	static int pos_jugada_x, pos_jugada_y;
	static int turno;
	
	/* constantes */
	static final int NUM_FILAS = 3, NUM_COLUMNAS = 3;
	static final int VACIO=0, X=1, O=2;
	static final int NUM_JUGADORES = 2;
	
	static Scanner miLectorConsola;
	
	/*****************/
	
	
	
	/****** métodos *******/
	
	/** método principal */
	/* mi programa empieza su ejecución en esta función...*/
	public static void main(String[] args)
	{		
		tablero = new int[NUM_FILAS][NUM_COLUMNAS];
		miLectorConsola = new Scanner(System.in);
		
		inicializar_tablero();	
		pintar_tablero();
		
				
		/* el programa empieza a ejecutarse por acá... */
		while(   ganador != X || ganador != O  )
		{
			//completar:
			
			//obtener jugada
			//actualizar tablero
			obtener_jugada();
			
						
			//pintar tablero
			pintar_tablero();
			
			validar_ganador (turno);
		}
	}
	
	/* Ejercicio 1, punto 1*/
	public static void inicializar_tablero()
	{
		for(int i = 0; i < NUM_FILAS; i++)
		{
			for(int j=0; j < NUM_COLUMNAS; j++)
			{
				tablero[i][j] = VACIO;
			}
		}
		/**/
	}
	
	
	//void significa que no devuelve valor
	/* Ejercicio 1, punto 2*/
	public static void obtener_jugada()
	{
	    //leer desde consola la jugada y poner el valor en la matriz del 
		//tablero
		int jugada_col, jugada_fila;
		System.out.print("Turno: "+turno+". Dónde desea jugar (fila)?");
		jugada_fila = miLectorConsola.nextInt();
		
		System.out.print("Turno: "+turno+". Dónde desea jugar (columna)?");
		jugada_col = miLectorConsola.nextInt();
		
		tablero[jugada_fila][jugada_col] = turno;
	}
	
	/* Ejercicio 1, punto 3*/
	/**
	 * 
	 * @param figura: X o O
	 * @return
	 */
	public static boolean validar_ganador(int figura)
	{
		boolean val_ret = false;
		/****/
		/* validar filas */
		validar_filas();
		
		
		/* validar columnas */
		validar_columnas();
		
		
		/* validar diagonales */
		validar_diagonales();
		
		/*****/
		return val_ret;	
		
	}
	
	public boolean validar_filas(int f)
	{
		boolean val_ret = false;
		if(      )
		{
			
		}
		
		
		return val_ret;	
		
	}
	
	public static void pintar_tablero()
	{
		//pintar el tablero actualizado por consola
		for(int i = 0; i < NUM_FILAS; i++)
		{
			for(int j=0; j < NUM_COLUMNAS; j++)
			{
				System.out.print("|"+tablero[i][j]+"|");
			}//aquí termina de imprimir una fila			
			System.out.println("");
		}
	}	

}
