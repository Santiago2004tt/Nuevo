package panaderia.test;


import junit.framework.TestCase;
import panaderia.model.Panaderia;
import panaderia.model.Panes;

public class Main extends TestCase {
	static Panaderia panaderia = new Panaderia("la panaderia tt", "en una casa #3");
	
	public static void main(String[] args) {
		
		Panes pan1 = new Panes('m', 2000, 1, "queso");
		String mensaje = panaderia.crearPan(pan1);
		//Panes panBuscado = panaderia.buscarPan("queso");// duda me da error por el throw
		
		
	}
	
	/**
	 * test 1 que se verificara si se esta creando correctamente 
	 */
	public static void test1() {
		Panes pan1 = new Panes('m', 2000, 1, "queso");
		String mensajeResultado = panaderia.crearPan(pan1);
		assertEquals("el pan fue creado",mensajeResultado );
	}
	
	/**
	 * test 2 que se verificara si se esta verificando que si verifique que fue creado
	 */
	public static void test2() {
		Panes pan1 = new Panes('m', 2000, 1, "queso");
		Panes pan2 = new Panes('m', 2000, 1, "queso");
		panaderia.crearPan(pan1);
		String mensajeResultado = panaderia.crearPan(pan2);
		assertEquals("El pan ya existe",mensajeResultado );
	}

}
