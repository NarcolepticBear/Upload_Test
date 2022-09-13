package matadorspil.flyttet.test;
//Definition af en spiller
public class Spiller {
	
	String navn;		//Spillerens navn, f.eks. "Søren"
	int konto;			//Antal kroner på spillerens konto
	int feltnr;			//Hvad nummer felt spilleren står på. "Start" er nummer 0
	int slag;
	
	public Spiller(String navn, int konto) {
		this.navn = navn;
		this.konto = konto;
		feltnr = 0;
	}
	
	//En besked til spilleren
	public void besked(String besked) {
		System.out.println(navn+": "+besked);
	}
	
	//Et ja/nej-spørgsmål. Svarer brugeren ja returneres true, ellers false
	public boolean spørgsmål(String spørgsmål) {
		String spm = navn+": Vil du " + spørgsmål + "?";
		String svar = javax.swing.JOptionPane.showInputDialog(spm, "ja");
		System.out.println(spm + " " + svar);
		if (svar != null && svar.equals("ja")) return true;
		else return false;
	}
	
	public void transaktion(int kr) {
		konto = konto + kr;
		System.out.println(navn+"s konto lyder nu på " + konto + " kr.");
	}
	
	public void betal(Spiller modtager, int kr) {
		System.out.println(navn + " betaler " + modtager.navn + ": " + kr + " kr.");
		modtager.transaktion(kr);
		transaktion(-kr);
	}
	
	public int kast() {
		this.slag = (int) (Math.random() * 6) + 1;
		return slag;
	}
}








