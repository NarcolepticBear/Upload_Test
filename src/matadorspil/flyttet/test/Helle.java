package matadorspil.flyttet.test;

public class Helle extends Felt {
	int gevinst;
	
	public Helle (int gevinst) {
		navn = "Helle";			//navn er arvet fra Felt
		this.gevinst = gevinst;
	}
	
	public void landet(Spiller sp) {		//Tilsides�t metode i Felt
		sp.besked("Du lander p� Helle og f�r overf�rt " + gevinst);
		sp.transaktion(gevinst);		//Opdater spillerens konto
	}
}
