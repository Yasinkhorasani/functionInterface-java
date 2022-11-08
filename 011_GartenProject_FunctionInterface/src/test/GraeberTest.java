package test;

import de.myGarten.Bagger;
import de.myGarten.Graber;
import de.myGarten.Regenwurm;
import de.myGarten.Spaten;

public class GraeberTest {

	public static void main(String[] args) {

		
		Graber luca = ()-> "Mit Spaten kann man gut graben";
		System.out.println(luca.graben());
		
		System.out.println("\n***********************************\n");
	     Bagger benz = new Bagger(23) {

			@Override
			public String graben() {
				
				return "mein Gabel Können tief graben";
			}

			@Override
			public void tanken() {
				System.out.println("Benzin ist teur, ich müss nicht gasgeben");
			}
			
			
		};
		benz.bewegen();
		System.out.println(benz.graben());
		benz.tanken();
		benz.ausrüsten();
		
		System.out.println("****************************************\n");
		Regenwurm wurm = new Regenwurm(2);
		wurm.graben();
		wurm.tanken();
		
		System.out.println("****************************************\n");
		Spaten spaten1 = (a, b)-> {return a+ b;};
		String a = "Edelstein";
		String b ="Holz";
		spaten1.spaten(a,b );
		System.out.println(spaten1.spaten(a, b));
		
	}

	 
	
	
}
