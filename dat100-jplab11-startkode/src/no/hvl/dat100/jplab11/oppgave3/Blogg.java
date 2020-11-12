package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for(int i = 0; i < nesteledig; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return true;
            }
        }
        return false;
	}
	

	public boolean ledigPlass() {
		return (nesteledig<innleggtabell.length);

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		else { 
			return false;
		}
	}
	
	public String toString() {
		String streng = nesteledig+"\n";
		for(int i = 0; i < nesteledig; i++) {
			streng += innleggtabell[i].toString();
		}
		return streng;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nytabell = new Innlegg[innleggtabell.length*2];
		for(int i=0; i<innleggtabell.length; i++) {
			nytabell [i]=innleggtabell[i];
		}
		innleggtabell=nytabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		if(finnes(innlegg)) {
			if(!ledigPlass()) {
				utvid();
				leggTil(innlegg);
				return true;
			}
		}
		return false;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}