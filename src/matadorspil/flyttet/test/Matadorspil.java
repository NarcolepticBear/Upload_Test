package matadorspil.flyttet.test;
import java.util.ArrayList;
public class Matadorspil {
	ArrayList<Felt> felter = new ArrayList<Felt>(); //Indeholder alle felter
	
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();		//Alle spillere
	
	int spillersTur = 0;
	
	public Matadorspil() {
		felter.add(new Start(5000));
		felter.add(new Gade("Rødovrevej", 10000, 400, 1000));
		felter.add(new Gade("Hvidovrevej", 10000, 400, 1000));
		felter.add(new Rederi("Maersk", 17000, 4200));
		felter.add(new Gade("Gade 3", 12000, 500, 1200));
		felter.add(new Gade("Gade 4", 12000, 500, 1200));
		felter.add(new Gade("Gade 5", 15000, 700, 1500));
		felter.add(new Helle(15000));
		felter.add(new Gade("Frederiksberg Allé", 20000, 1100, 2000));
		felter.add(new Gade("Rådhuspladsen", 20000, 1100, 2000));
		felter.add(new Bryggeri("bryggeri", 5000, 250));
	}
}
