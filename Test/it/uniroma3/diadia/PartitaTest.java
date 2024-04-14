package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.giocatore.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PartitaTest {
	private Partita Partita1;
	private Partita Partita2;
	private Labirinto Labirinto1;
	private Labirinto Labirinto2;
	private boolean finita;
	private Giocatore Giocatore1;
	private Giocatore Giocatore2;
	@BeforeEach
	public void setUp() {
	 Partita1=new Partita();
	 Partita2=new Partita();
	 Labirinto1=new Labirinto();
	 Labirinto2=new Labirinto();
	 Giocatore1=new Giocatore();
	 Giocatore2=new Giocatore();
	 Partita1.setLabirinto(Labirinto1);
	 Partita2.setFinita();
	 Partita1.setFinita();
	 finita=true;
	 Partita1.setGiocatore(Giocatore1);
	 
	}
/*test su get labirinto*/
	@Test
	public void testgetLabirinto() {
		assertEquals(Labirinto1, Partita1.getLabirinto() );
	}
	@Test
	public void testgetLabirintosbagliato() {
		assertNotEquals(Labirinto2, Partita1.getLabirinto() );
	}
	@Test
	public void testgetLabirintonullo() {
		assertNotEquals(null, Partita2.getLabirinto() );
	}
/*test su is finita*/
	@Test
	public void testisFinita(){
		assertEquals(true, Partita2.isFinita());
	}
	@Test
	public void testisFinita2(){
		assertEquals(true, Partita1.isFinita());
	}
/*test su get giocatore*/
	@Test
	public void testgetGiocatore(){
		assertEquals(Giocatore1, Partita1.getGiocatore());
	}
	@Test
	public void testgetGiocatorediverso(){
		assertNotEquals(Giocatore2, Partita1.getGiocatore());
	}
	@Test
	public void testgetnoGiocatore(){
		assertNotEquals(null, Partita2.getGiocatore());
	}
}