import java.util.ArrayList;

public class Rechteck extends Figur {
	// "Ist ein Beziehungen"
	// Zugriff erlauben fpr Klassen, die unterhalb in der Vererbungshierarchie liegen
	protected double breite;
	protected double laenge;
	
	// Überladene Methoden (innerhalb einer Klasse)
	// Gleicher Name, unterschiedliche Signatur
	// Rechteck() und Rechteck(double, double)
	public Rechteck() {
		this.breite = 1.;
		this.laenge = 1.0;
	}
	
	public Rechteck(double b, double h) {
		this.breite = b;
		this.laenge = h;
	}
	
	public void status() {
		System.out.println("Ich bin ein Rechteck");
	}
	
	/**
	 * This method calculates the area of the figure
	 */
	public double flaeche() {
		return this.breite * this.laenge;
	}
	
	public double umfang() {
		return 2* this.breite + 2 * this.laenge;
	}
	
	public void scale(double fac) {
		this.breite *= fac;
		this.laenge *= fac;
	}
	
	// wir geben dieser Methode eine neue semantik
	// toString() in Object: liefert Hex-wert
	// toString() in Rechteck liefert eine Beschreibung des Rechtecks.
	// Wenn toString() in Rechteck nicht vorhanden ist, wird automatisch
	// die toString()-Methode aus Object genommen. 
	// Wir nennen das Überschreiben von Methoden.
	public String toString() {
		return this.breite + " " + this.laenge;
	}
	

	// als Eingabe wird alles akzeptiert, was ein Rechteck und davon abgeleitet ist.
	public static void ausgabe(Rechteck form) {
		form.status(); // Hier sucht sich das System die korrekte Methode aus
		// kein Zugriff auf hoehe, da diese nicht zum Rechteck gehört
		// System.out.println(form.hoehe);
		// form.volumen();
	}
	
}
