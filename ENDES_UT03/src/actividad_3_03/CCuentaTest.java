package actividad_3_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CCuentaTest {

	@Test
	void testIngresar() throws Exception {
		CCuenta miCuenta = new CCuenta("Juan López","1000-2365-85-123456789", 2500, 0);
		System.out.println("ingresar");
		double cantidad = 70.0;
		
		miCuenta.ingresar(cantidad);

	}

}
