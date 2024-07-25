package may03;

import java.util.*;

public class EjercicioDiscografica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> discos = new ArrayList<>();
		
		int opc;
		do {
			System.out.flush();
	        System.out.println("===================");
		    System.out.println("1. Listado");
		    System.out.println("2. Nuevo disco");
		    System.out.println("3. Modificar");
		    System.out.println("4. Borrar");
		    System.out.println("5. Oredenar Discos");
		    System.out.println("6. Salir");
		    System.out.print("Introduce opción: ");
		    opc = Integer.parseInt( entrada.nextLine() );
		    
		    switch(opc) {
		    case 1:
		    	System.out.println("Listado Discos");
		    	if (discos.size() == 0) {
		    		System.out.println("Lista de discos vacia");
		    		break;
		    	}
		    	for (String s:discos) {
		    		System.out.println("Nombre disco: " + s);
		    	}
		    	break;
		    case 2:
		    	System.out.println("Nuevo Disco");
		    	System.out.print("Disco a incluir: ");
		    	discos.add(entrada.nextLine());
    			System.out.println("Disco incluido");
		    	break;
		    case 3:
		    	System.out.println("Modificar Disco");
		    	System.out.print("Disco a modificar: ");
		    	String modificar = entrada.nextLine();
		    	for (int i=0;i<discos.size();i++) {
		    		if (discos.get(i).equals(modificar) ) {
		    			System.out.print("Nuevo nombre: ");
		    			String nuevoNombre = entrada.nextLine();
		    			discos.set(i, nuevoNombre);
		    			System.out.println("Disco modificado");
		    		}
		    	}
		    	break;
		    case 4:
		    	System.out.println("Borrar disco");
		    	System.out.print("Disco a borrar: ");
		    	String borrar = entrada.nextLine();
		    	boolean eliminado = false;
		    	for (int i=0;i<discos.size();i++) {
		    		if (discos.get(i).equals(borrar) ) {
		    			discos.remove(i);
		    			System.out.println("Disco borrado");
		    			eliminado = true;
		    		} 
		    	}
		    	if (eliminado) {
		    		System.out.println("Se ha eliminado el disco indicado");
		    	} else {
		    		System.out.println("No se ha encontrado el disco en el listado");
		    	}
		    	break;

		    case 5:
		    	System.out.println("Ordenar discos");
		    	Collections.sort(discos);
		    	System.out.println("Discos ordenados");
		    	break;
		    case 6:
		    	System.out.println("Fin aplicación");
		    	break;
		    default:
		    	System.out.println("Opción no válida. Vuelve a intentarlo.");
		    }
	    
		} while (opc != 6);

		entrada.close();
		System.exit(0);
	}

}
