package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class LabirintoTest {
	Labirinto l;
	Stanza Salone;
	Stanza N11;

	@BeforeEach
	public void setUp() {
		l = new Labirinto();
		l.creaStanze();
		Salone = new Stanza("Salone");
		N11 = new Stanza("N11");
	}

/*test su get stanza vincente*/
	@Test
	void testGetStanzaVincente(){
		assertEquals("Biblioteca",l.getStanzaVincente().getNome());
		
	}
	@Test
	void testGetStanzaVincenteFalse() {
		assertNotEquals("Salone",l.getStanzaVincente().getNome());
	}
	@Test
	void testGetStanzaVincenteNull() {
		assertNotEquals(null,l.getStanzaVincente().getNome());
	}
/*test su set stanza corrente*/
	@Test
	void testSetStanzaCorrente() {
		l.setStanzaCorrente(Salone);
		assertEquals("Salone",l.getStanzaCorrente().getNome());
	}
	@Test
	void testSetStanzaCorrenteNull() {
		l.setStanzaCorrente(null);
		assertEquals(null,l.getStanzaCorrente());
	}
	@Test
	void testSerStanzaCorrenteFalse() {
		l.setStanzaCorrente(N11);
		assertNotEquals("Salone",l.getStanzaCorrente().getNome());
	}
}
