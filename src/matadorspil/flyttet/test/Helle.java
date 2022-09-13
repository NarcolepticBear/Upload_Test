package matadorspil.flyttet.test;

public class Helle extends Felt {
	int gevinst;
	
	public Helle (int gevinst) {
		navn = "Helle";			//navn er arvet fra Felt
		this.gevinst = gevinst;
	}
	
	public void landet(Spiller sp) {		//Tilsidesæt metode i Felt
		sp.besked("Du lander på Helle og får overført " + gevinst);
		sp.transaktion(gevinst);		//Opdater spillerens konto
	}
}
