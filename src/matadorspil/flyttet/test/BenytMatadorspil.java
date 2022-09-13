package matadorspil.flyttet.test;
//Her i v3 laves klassen Grund, som arver fra felt og som gade, rederi og bryggeri arver fra
public class BenytMatadorspil {
	public static void main(String[] arg) {
		Matadorspil spil = new Matadorspil();
		spil.spillere.add(new Spiller("S�ren", 50000));	//Opret spiller S�ren
		spil.spillere.add(new Spiller("Gitte", 50000));	//Opret spiller Gitte
		
		//L�b gennem 20 runder(40 ture)
		for (spil.spillersTur = 0; spil.spillersTur < 10; spil.spillersTur++) {
			//Tag skiftevis S�ren og Gitte
			Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
			int slag = sp.kast();
			System.out.println("***** " + sp.navn +" p� felt " + sp.feltnr + " sl�r " + slag);
			
			for (int i=1; i<=slag; i=i+1) {			//Nu rykkes der
				//G� til n�ste felt. Hvis vi n�r over antal felter s� t�l fra nul
				sp.feltnr = sp.feltnr + 1;
				if (sp.feltnr == spil.felter.size()) sp.feltnr = 0;
				Felt felt = spil.felter.get(sp.feltnr);
				
				if(i < slag) felt.passeret(sp); //Kald passeret() p� passerede felter
				else felt.landet(sp);
				try { Thread.sleep(300);} catch (Exception e) {} //Vent 0.3 sek
			}
			try { Thread.sleep(2200); } catch (Exception e) {} //Tur slut, vent 3 sek
		}
		System.out.println();	//Linjeskift
		for (Spiller i : spil.spillere) {		//G�r igennem spillernes endelige konti og grunde.
			System.out.println(i.navn + " endte med " + i.konto + " kroner i sin konto");
			System.out.println(i.navn + " ejer f�lgende grunde:");
			for (Felt j : spil.felter) {
				if(j.ejer == i) {		//At f� metoden til at virke kr�vede at jeg i klassen Felt lavede en Ejer variabel. F�r var denne variabel lavet i Gade og i Rederi fordi Start og Helle aldrig skal have en ejer. Det ser dog ikke ud til at have nogen negative konsekvenser at lave variablen i Felt, da de steder ejer bliver brugt ligger inde i selve klasserne. dvs. at selvom Start og Helle nu har variablen ejer, vil de aldrig blive tildelt en ejer.
					System.out.println(j.toString());
				}
			}
			System.out.println();	//Linjeskift
		}
	}
}
