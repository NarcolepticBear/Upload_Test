package matadorspil.flyttet.test;

public class Bryggeri extends Grund {
	//Spiller ejer;
	//int pris;
	//int grundleje;
	
	public Bryggeri (String navn, int pris, int leje) {
		super(navn, pris, leje);
	}
	
	public int beregnLeje() {
		return grundleje;
	}
	
	public String toString() {
		return navn + " med en værdi på: " + pris;
	}
	
}







