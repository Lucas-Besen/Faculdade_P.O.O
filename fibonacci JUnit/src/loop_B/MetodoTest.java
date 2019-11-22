package loop_B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MetodoTest {
	
	Metodo tes = new Metodo();
	
	@Test
	void testeA() {
		int termo=12;
		tes.setQuantidade(termo);
		int resultadoEsperado=144;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
	
	@Test
	void testeB() {
		int termo=1;
		tes.setQuantidade(termo);
		int resultadoEsperado=1;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
	
	@Test
	void testeC() {
		int termo=5;
		tes.setQuantidade(termo);
		int resultadoEsperado=5;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
	void testeD() {
		int termo=-10;
		tes.setQuantidade(termo);
		int resultadoEsperado=0;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
	void testeE() {
		int termo=-1;
		tes.setQuantidade(termo);
		int resultadoEsperado=0;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
	
	@Test
	void testeF() {
		int termo=0;
		tes.setQuantidade(termo);
		int resultadoEsperado=0;
		Assertions.assertEquals(resultadoEsperado,tes.getUltimo());
	}
}
