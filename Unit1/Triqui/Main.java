public class Main 
{
    //sección para declarar variables y constantes (atributos)
	/** atributos **/
	/*constantes*/
	static final byte TAM_TABLERO = 3;
	static final byte NUM_JUGADORES = 2;
	static final char CASILLA_VACIA = ' ';
	static final char CASILLA_X = 'X';
	static final char CASILLA_0 = 'O';
	
	/****************/
	static final byte GANADOR1=1, GANADOR2=2, EMPATE=0;
	
	
	/* variables */
	static char tablero[][];
	static byte ganador = 0;
	static char turno;
	
	
	/*
	 * sección para declarar los métodos o funciones
	 */
	
	//método principal (punto de entrada de mi programa)
	public static void main( String[] args  )
	{
		System.out.println("Hola, Algoritmos 2");
		
		tablero = new char[TAM_TABLERO][TAM_TABLERO];
		
		/* inicializar tablero :*/
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				tablero[i][j] = CASILLA_VACIA;
			}
		}
		/*...*/
		
		
	}
	/********************************/	
	
}
