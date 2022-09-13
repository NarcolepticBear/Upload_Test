package matadorspil.flyttet.test;
//Superklassen for alle matadorspillets felter
public class Felt {
	Spiller ejer;
	String navn;		//Feltets navn, f.eks. "Hvidovrevej"
	
	/* Kaldes når en spiller passerer dette felt*/
	public void passeret(Spiller sp) {
		sp.besked("Du passerer " + navn);
	}
	
	/* Kaldes når en spiller lander på dette felt */
	public void landet(Spiller sp) {
	}
	
	public String toString() {
		return navn;
	}
}

