package cl.ubb.agil.calculadora.ejemplo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Calculator;

public class test {
private Calculator calculadora; 
	@Before
	public void setup() throws Exception{
		
		calculadora = new Calculator();
	}
	
	
	@Test
	public void sumarDosMasTresEsCinco(){
		
		/* Arrange */
		/*Calculator calculadora = new Calculator();
		*/
		/* Act */
		int resultado = calculadora.adder(2,3);
		
		/* Assert */
		assertThat(resultado,is(5));
	}
	@Test
	public void restarCuatroMenosDosEsDos(){
		
		/* Arrange */
		/*Calculator calculadora = new Calculator();
		*/
		/* Act */
		int resultado = calculadora.subtractor(4, 2);
		
		/* Assert */
		assertThat(resultado,is(2));
	}
	@Test
	public void expressionAdderTestCadenaIncorrecta() throws Exception{
		/* arrange */
		/*Calculator calculadora = new Calculator();*/
		
		/* act */
		String aux = "2+3+4";
		int resultado = calculadora.expressionAdder(aux);
		
		/* Assert */
		
		assertThat(resultado, is(9));
		
	}
	@Test (expected = ArithmeticException.class)
	public void divisionPorCero(){
		float resultado = calculadora.divider(3,0);
		
	}
	@Test
	public void multiplicarPorCero(){
		int resultado = calculadora.multiplier(8, 0);
	}
	
}
