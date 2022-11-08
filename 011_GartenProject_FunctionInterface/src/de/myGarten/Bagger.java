package de.myGarten;

/**
 * 
 * @author Alfa
 *
 */
abstract public class Bagger implements Graber {
	
	
	int stunde =1;
	
	/**
	 * konstroktur
	 * @param stunde 
	 * 
	 */
	public Bagger(int stunde) {
	super();
	this.stunde= stunde;
	}
	
	/**
	 * @return the stunde
	 */
	public int getStunde() {
		return stunde;
	}

	/**
	 * @param stunde the stunde to set
	 */
	public void setStunde(int stunde) {
		this.stunde = stunde;
	}

	
	// eine final Methode in eine abstrakt-Kalasse
	public final void ausrüsten() {
		System.out.println("als Bagger müss ich ausgerüstet sein");
	};
	@Override
	public String toString() {
		return "Bagger [stunde=" + stunde + "]";
	}

	// abstrakte Methode
	public abstract void tanken();
		

}
