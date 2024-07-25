package may06;

public class TestClasesInternas {

	public static void main(String[] args) {
		
		ClaseExterna ce = new ClaseExterna();
		ClaseExterna.ClaseInterna ci = ce.new ClaseInterna();
		
		System.out.println( ce.x +  ci.y);	
	}

}
