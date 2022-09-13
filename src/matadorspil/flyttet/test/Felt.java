package matadorspil.flyttet.test;
//Superklassen for alle matadorspillets felter
public class Felt {
	Spiller ejer;
	String navn;		//Feltets navn, f.eks. "Hvidovrevej"
	
	/* Kaldes n�r en spiller passerer dette felt*/
	public void passeret(Spiller sp) {
		sp.besked("Du passerer " + navn);
	}
	
	/* Kaldes n�r en spiller lander p� dette felt */
	public void landet(Spiller sp) {
	}
	
	public String toString() {
		return navn;
	}
}

