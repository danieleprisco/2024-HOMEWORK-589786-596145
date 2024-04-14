package it.uniroma3.diadia;
import java.util.Scanner;
public class IOConsole {
	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		/* Riga da non implementare ci torneremo poi
		scannerDiLinee.close(); */
		return riga;
	}
}