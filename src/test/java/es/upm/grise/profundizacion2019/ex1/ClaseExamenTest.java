package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2019.ex1.ClaseExamen;;

public class ClaseExamenTest {

	private ClaseExamen exam = new ClaseExamen();

	/**
	 * Primera condicion falsa
	 * 
	 * Segunda condicion verdadera
	 */
	@Test
	public void test1() {
		assertEquals(0, exam.metodoAProbar(0, 1), 0);
	}

	/**
	 * Primera condicion verdadera
	 * 
	 * Segunda condicion verdadera
	 */
	@Test
	public void test2() {
		assertEquals(0, exam.metodoAProbar(2, 1), 0);
	}

	/**
	 * Primera condicion no importa
	 * 
	 * Segunda condicion falsa. Es inalcanzable.
	 * 
	 * Como no se puede realizar esta prueba; el codigo nunca tendra el 100% de
	 * cobertura
	 */
//	@Test
//	public void test3() {
//		assertEquals(1, exam.metodoAProbar(2, 1), 0);
//	}

}
