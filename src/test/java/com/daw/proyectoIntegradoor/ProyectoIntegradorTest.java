package com.daw.proyectoIntegradoor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import control.MenuListener;
import vista.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ProyectoIntegradorTest {

	private AyudaProyect ayudaProyect;
    private AreasProyect areasProyect;
    private AddProyect addProyect;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ayudaProyect = new AyudaProyect();
        areasProyect = new AreasProyect();
        addProyect = new AddProyect();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInicializarComponentes() {
		assertNotNull(ayudaProyect.getListaProy2());
		assertNotNull(ayudaProyect.getOpenBtn());
		assertEquals(666, ayudaProyect.getWidth());
		assertEquals(479, ayudaProyect.getHeight());
	}

	@Test
	public void testObtenerRespuesta() {
		// Prueba para una pregunta existente
		String respuesta = ayudaProyect.obtenerRespuesta("¿Cómo cambio mi contraseña?");
		assertEquals("Puedes cambiar tu contraseña desde la configuración de tu cuenta.", respuesta);

		// Prueba para una pregunta inexistente
		respuesta = AyudaProyect.obtenerRespuesta("¿Esta pregunta no existe?");
		assertEquals("No se encontró una respuesta para la pregunta seleccionada.", respuesta);
	}
    @Test
    public void testInicializarComponentes1() {
        areasProyect.inicializarComponentes();
        assertNotNull(areasProyect.getConsulItem());
        assertNotNull(areasProyect.getAddItem());
    }
    @Test
    public void testSetListener() {
        MenuListener listener = new MenuListener(areasProyect);
        areasProyect.setListener(listener);
//        assertNotNull(areasProyect.getConsulItem().getActionListeners());
//        assertNotNull(areasProyect.getAddItem().getActionListeners());
    }
    
	@Test
	public void testProyectoIntegrador() {
		fail("Not yet implemented");
	}

}
