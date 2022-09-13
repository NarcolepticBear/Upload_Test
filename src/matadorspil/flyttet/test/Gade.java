package matadorspil.flyttet.test;

public class Gade extends Grund {
	//Spiller ejer;
	//int pris;
	//int grundleje;
	int antalHuse = 0;
	int huspris;
	
	public Gade (String navn, int pris, int leje, int huspris) {
		super(navn, pris, leje);
		this.huspris = huspris;
	}
	
	public int beregnLeje() {
		return grundleje + (antalHuse * huspris);
	}
	
	public void landet(Spiller sp) {
		if (sp== ejer) {
			super.landet(sp);	//Det her er skrevet som i bogen, men man kan nu k�be hus i samme runde som man k�ber gaden.
			if (sp == ejer) {						//Spilleren ejer selv feltet
				if (antalHuse <5 && sp.konto > huspris && sp.sp�rgsm�l("K�be hus for " + huspris)) {	//Sp�rgsm�let stilles kun hvis alle betingelserne er opfyldt.
					ejer.transaktion(-huspris);
					antalHuse = antalHuse + 1;
					sp.besked("Du bygger hus p� " + navn + " for " + huspris);
				}
			}
		} else {
			super.landet(sp);
		}
		
	}
	public String toString() {
		return navn + " med " + antalHuse + " hus(e). Totalv�rdien er: " + (pris+(antalHuse*huspris));
	}
}






