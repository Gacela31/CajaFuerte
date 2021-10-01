package cerradura;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void alCrearUnaCajaFuerteEsteAbierta() {
		CajaFuerte miCaja = new CajaFuerte();
		
		assertTrue(miCaja.estaAbierta());
	}

}
