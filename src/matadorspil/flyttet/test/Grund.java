package matadorspil.flyttet.test;

public class Grund extends Felt {
	int pris;
	int grundleje;
	
	public Grund(String navn, int pris, int leje) {
		this.navn = navn;
		this.pris = pris;
		this.grundleje = leje;
	}
	
	public int beregnLeje() {
		return grundleje;
	}
	
	public void landet(Spiller sp) {
		sp.besked("Du er landet på " + navn);
		if (sp == ejer) {					//Spiller ejer selv grunden
			sp.besked("Det er din egen grund");
		} else if(ejer == null) {				//Feltet ejes ikke af nogen
			if (sp.konto > pris) {
				if (sp.spørgsmål("Købe " + navn + " for " + pris)) {
					sp.transaktion(-pris);
					ejer = sp;
				}
			} else {
				sp.besked("Du har ikke penge nok til at købe " + navn);
			}
		} else {								//Feltet ejes af en anden spiller
			int leje = beregnLeje();
			sp.besked("Leje: " + leje);
			sp.betal(ejer, leje);
		}
	}
}
