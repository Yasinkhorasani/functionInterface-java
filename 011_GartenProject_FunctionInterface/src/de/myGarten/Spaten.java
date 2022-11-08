package de.myGarten;
/**
 * Demonstriert die Verwendung einer Methode in einmem funktionalen Interface 
 * mit 2 Parametern im Lambda-Ausdruck 
 * @author Alfa
 *
 */
@FunctionalInterface
public interface Spaten {
	/**
	 * verknüpft zwei Spaten-Stoff
	 * @param a
	 * @param b
	 * @return die Stoffe des Spatens
	 */
	String spaten(String a, String b);

}
