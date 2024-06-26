package it.uniroma3.diadia;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BorsaTest {
	
	private Borsa b = new Borsa();
	private Attrezzo ascia;
	private Attrezzo Falce;
	
	@BeforeEach
	void setUp() {
		ascia=new Attrezzo("ascia",5);
		Falce=new Attrezzo("Falce",13);
		
	}
/*test su add attrezzo*/
	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertEquals(true,b.addAttrezzo(ascia));
	}
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertEquals(false,b.addAttrezzo(Falce));
	}
	@Test
	public void testAddAttrezzoNull() {
		assertNotEquals(Falce,b.addAttrezzo(ascia));
	}
/*test su get attrezzo*/
	@Test
	public void testGetAttrezzo() {
		b.addAttrezzo(ascia);
		assertEquals(ascia,b.getAttrezzo("ascia"));
	}
	@Test
	public void testGetAttrezzoNull() {
		b.addAttrezzo(ascia);
		assertNotEquals(Falce,b.getAttrezzo("ascia"));
	}
/*test su get peso*/
	@Test
	public void testGetPesoTrue() {
		b.addAttrezzo(ascia);
		assertEquals(5,b.getPeso());
	}
	@Test
	public void testGetPesoFalse() {
		b.addAttrezzo(ascia);
		assertNotEquals(10,b.getPeso());
	}
}

