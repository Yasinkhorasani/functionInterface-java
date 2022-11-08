package de.myGarten;

/**
 * ein Reggenwurm ist ein Bagger 
 * damit auch ein grabber
 * @author Yasin
 *
 */
public class Regenwurm extends Bagger {

	public Regenwurm(int stunde) {
		super(stunde);
		
	}
	/**
	 * Beschrieben im Interface Graber
	 * Nicht implementiert in der Klasse Bagger
	 * deshalb MUSS hier implementiert werden
	 */
	@Override 
	public String graben() {
		System.out.println("ich kann auch graben");
		return null;
	
	}
	/**
	 * beschrieben in der Klasse Bagger
	 * wird hier implelementiert
	 */
	@Override 
	public void tanken() {
		System.out.println("ich müss mich nicht tanken lassen");
		
	}

}
