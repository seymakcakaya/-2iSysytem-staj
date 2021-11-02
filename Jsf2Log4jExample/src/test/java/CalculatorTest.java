import static org.junit.Assert.*;

import org.junit.Test;

import calculator.CalculatorManager;

public class CalculatorTest {
private CalculatorManager calculator= new CalculatorManager();
	@Test
	public void addTest() {
	int result=45;
	int actual=(int) calculator.addition(32, 13);
	assertEquals(result, actual);
	}
	@Test
	public void divTest() {
	int result=4;
	int actual=(int) calculator.division(32, 8);
	assertEquals(result, actual);
	

	}@Test
	public void divTest2() {
	int result=0;
	int actual=(int) calculator.division(0, 8);
	assertEquals(result, actual);
	

	}


	@Test
	public void subTest() {
	int result=13;
	int actual=(int) calculator.subtraction(0, -13);
	assertEquals(result, actual);
	

	}
	@Test
	public void multTest() {
	int result=-12;
	int actual=(int) calculator.multiplication(12, -1);
	assertEquals(result, actual);
	

	}
	@Test
	public void addTest2() {
	int result=0;
	int actual=(int) calculator.addition(10, -10);
	assertEquals(result, actual);
	

	}



}
