package matadorspil.flyttet.test;

public class Rederi extends Grund {
	//Spiller ejer;
	//int pris;
	//int grundleje;
	
	public Rederi(String navn, int pris, int leje) {
		super(navn, pris, leje);	//Overf�r v�rdierne til superklassens konstrukt�r
	}
	
	public String toString() {
		return navn + " med en v�rdi p�: " + pris;
	}
}
