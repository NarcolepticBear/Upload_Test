package matadorspil.flyttet.test;

public class Rederi extends Grund {
	//Spiller ejer;
	//int pris;
	//int grundleje;
	
	public Rederi(String navn, int pris, int leje) {
		super(navn, pris, leje);	//Overfør værdierne til superklassens konstruktør
	}
	
	public String toString() {
		return navn + " med en værdi på: " + pris;
	}
}
