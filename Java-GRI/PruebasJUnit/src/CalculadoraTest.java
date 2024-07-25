import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora(20,5);
		assertEquals(25, calcu.suma() ) ;
	}
	@Test
	void testResta() {
		Calculadora calcu = new Calculadora(20,5);
		assertEquals(25, calcu.suma() ) ;
	}
	@Test
	void testProducto() {
		Calculadora calcu = new Calculadora(20,5);
		assertEquals(25, calcu.suma() ) ;
	}
	@Test
	void testCociente() {
		Calculadora calcu = new Calculadora(20,5);
		assertEquals(25, calcu.suma() ) ;
	}
}


