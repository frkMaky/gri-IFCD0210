import java.util.Scanner;

public class EjercicioC {

	public static void main(String[] args) {
		   
		Scanner sc = new Scanner (System.in);
	        
	    System.out.println("Introduce caracteres");
	        
	    char letra ='.'; // inicializo la letra fuera del while con un valor que no lo termine
	    
        while(letra != '=') { //MIENTRAS letra SEA DISTINTO DE = (al usar nextLine() lee los espacios, podria terminar con un espacio
        
        	// Te FALTABA incluir el pedir el caracter dentro del while ( lo tenias fuera) 
        	
    	    letra = sc.nextLine().toUpperCase().charAt(0); // Pide un caracter no una cadena
    	        
        	
        	/** Este FOR  sobra ya que ahora lees caracter y no cadena */
            // for(int i = 0 ;( i < cadena1.length()); i++ ) {
            // char caracter = cadena1.toUpperCase().charAt(i); // char caracter recoge el caracter introducido 
            
        	if(letra == 'A'||letra == 'E'||letra == 'I'||letra == 'O'||letra == 'U' || letra == 'Á'||letra == 'É'||letra == 'Í'||letra == 'Ó'||letra == 'Ú') {
                 System.out.println("Es vocal");
             }else {
                 System.out.println("No es vocal");
                 
             }
        }
        // break; esto sobra, terminas el while al introducir = 

	}

}
