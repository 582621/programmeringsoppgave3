package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		PrintWriter skriv = null;

		try {
			skriv = new PrintWriter(mappe + filnavn);
			String streng = samling.toString();
			skriv.write(streng);
		}
		catch (FileNotFoundException e) {
			System.out.println("Filen finnes ikke!");
		}
		finally {			
			if (skriv != null) {
				skriv.close();
				return true; 
			}
		}
		return false;
		
	}	
}
