package org.urjc.isi.travis;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
	}
	
	// Test para el ejercicio 3: que visite arco del 2 al 10 pero sin pasar por el cuerpo del while
	@Test
	public void test1() {
		PrintPrimes.main(new String[]{ "1" });
		assertEquals("Prime: 2\n", outContent.toString());
	}
	
	// Test para el ejercicio 7: cubre prime paths viables
	@Test
	public void test2() {
		PrintPrimes.main(new String[]{ "5" });
		assertEquals("Prime: 2\nPrime: 3\nPrime: 5\nPrime: 7\nPrime: 11\n", outContent.toString());
	}

}
