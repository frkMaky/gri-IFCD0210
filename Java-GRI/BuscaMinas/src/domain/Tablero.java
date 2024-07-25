package domain;

public class Tablero {
	
	private int[] filas;
	private int[] columnas;
	private int[] mina;
	
	public Tablero() {
		this.filas = new int[4];
		this.columnas = new int[5];
		this.mina = new int[2];
		this.mina[0] =  (int) (Math.floor(Math.random()*(4-1+1)+1)); // del 1 al 4
		this.mina[1] =  (int) (Math.floor(Math.random()*(5-1+1)+1)); // del 1 al 5
	}

	public int[] getFilas() {
		return filas;
	}

	public void setFilas(int[] filas) {
		this.filas = filas;
	}

	public int[] getColumnas() {
		return columnas;
	}

	public void setColumnas(int[] columnas) {
		this.columnas = columnas;
	}

	public int[] getMina() {
		return mina;
	}

	public void setMina(int[] mina) {
		this.mina = mina;
	}
	public String posiscionMina() {
		return "Posicion Mina X: " + this.mina[0] +  " Posicicon Y: " + this.mina[1];
	}
	public void dibujarTablero() {
		
		for (int i=1;i<= this.filas.length;i++ ) {
			for (int j=1;j<= this.columnas.length;j++ ) {
				
				// Comprobar si es la mina 
				if ( i == this.mina[0] && j == this.mina[1] ) {
					System.out.print("| X ");
					continue;
				}
				System.out.print("|   ");
				if (j == this.columnas.length) {
					System.out.print("|");
				}
			}	
			System.out.println();
			System.out.println("_____ _____ _____ _____ ");
		}
		
	}
	
}
