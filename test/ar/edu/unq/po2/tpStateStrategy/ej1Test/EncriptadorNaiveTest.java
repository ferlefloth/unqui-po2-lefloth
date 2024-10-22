package ar.edu.unq.po2.tpStateStrategy.ej1Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpStateStrategy.ej1.EncriptadorNaive;
import ar.edu.unq.po2.tpStateStrategy.ej1.ModeloEncriptacion1;
import ar.edu.unq.po2.tpStateStrategy.ej1.ModeloEncriptacion2;

class EncriptadorNaiveTest {

	@BeforeEach
	void setUp() throws Exception {
		ModeloEncriptacion1 modeloEncriptacion1 = new ModeloEncriptacion1();
		ModeloEncriptacion2 modeloEncriptacion2 = new ModeloEncriptacion2();
		EncriptadorNaive encriptadorNaive = new EncriptadorNaive(modeloEncriptacion1);
	}

	@Test
	void test() {
		ModeloEncriptacion1 modeloEncriptacion1 = new ModeloEncriptacion1();
		ModeloEncriptacion2 modeloEncriptacion2 = new ModeloEncriptacion2();
		EncriptadorNaive encriptadorNaive = new EncriptadorNaive(modeloEncriptacion1);
		assertEquals("Encriptando desde modelo1", encriptadorNaive.encriptar(""));
	}

}
