package de.myGarten;
/**
 * Hier wird dinge oder Person, die aus bestimmten Gründen eine Vertiefung in der Erde aushebt
 * 
 *  Dieses Projekt deminstriert Lambda-Ausdrücke: Deshalb ist das Graber-Interface ein 
 * Funktionales Interface
 * 
 * @author Yasin
 */

@FunctionalInterface
public interface Graber {

	/**
	 * Diese Methode ist  abstrakt und public 
	 * Diese Methode hat "eine Rückgabe", "keine Parameter"
	 * 
	 * @return das, was der Graber kann
	 * Jedes Objekt vom Typ Schlaukopf MUSS diese Methode implementiert haben
	 */
	
	String graben();
	
	
	default void bewegen() {
	
		System.out.println("Ein Graber müss sich immer bewegen");
		  }
}
//Übung JavaDoc: Collection
//Email-Generator überarbeiten/neues Projekt: List
//Prüfen, ob eine eingegeben email neu ist: JavaDoc
//"Mischen" der emailAdressen: JavaDoc


//Erstellen einer Map: JavaDoc, (später) Google / Insel
//Erfinden eines Beispiels, das die Map sinnvoll nutzt