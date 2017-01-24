package devcast.palestra.git;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFibonacci {

	@Test
	public void testFibonacci() {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0,fibonacci.calcularFibonacci(0));
	}

}
