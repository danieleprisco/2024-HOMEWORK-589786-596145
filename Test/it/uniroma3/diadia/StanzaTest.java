package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StanzaTest {
	private Stanza Cameretta;
	private Stanza Bagno;
	private Stanza Salone;
	private Attrezzo spada;
	private Attrezzo machete;
	private Attrezzo ascia;

	
	
	
	@BeforeEach
	public void setup() {
		Cameretta=new Stanza("Cameretta");
		Bagno=new Stanza("Bagno");
		spada=new Attrezzo("spada", 7);
	    machete=new Attrezzo("machete",5);
		ascia=new Attrezzo("ascia",10);
		Cameretta.impostaStanzaAdiacente("est",Bagno);
		Cameretta.impostaStanzaAdiacente("ovest", Salone);
		Cameretta.addAttrezzo(spada);
		Cameretta.addAttrezzo(machete);
		//Cameretta.addAttrezzo(ascia);
		
	}
/*test su get stanza adiacente a est*/
	@Test
	void testGetStanzaAdiacenteAEst() {
		assertEquals(Bagno,Cameretta.getStanzaAdiacente("est"));
	}
	@Test
	void testGetStanzaAdiacenteAOvest() {
		assertEquals(Salone,Cameretta.getStanzaAdiacente("ovest"));
	}
	@Test
	void testGetStanzaAdiacenteANordNull() {
		assertEquals(null,Cameretta.getStanzaAdiacente("nord"));
	}
	
/*test su getNome*/
	@Test
	void testGetNomeCameretta() {
		assertEquals("Cameretta",Cameretta.getNome());
	}
	@Test
	void testGetNomeBagno() {
		assertNotEquals("agno",Bagno.getNome());
	}
	@Test
	void testGetNomeBagno2() {
		assertNotEquals("Cameretta",Bagno.getNome());
	}
/*test su GetAttrezzi*/
	@Test
	void testGetAttrezzi() {
		assertEquals(spada,Cameretta.getAttrezzi()[0]);
	}
	@Test 
	void testGetAttrezzinull() {
		assertNotEquals(machete,Cameretta.getAttrezzi()[0]);
	}
	@Test
	void testGetAttrezzi2() {
		assertEquals(machete,Cameretta.getAttrezzi()[1]);
	}
}
