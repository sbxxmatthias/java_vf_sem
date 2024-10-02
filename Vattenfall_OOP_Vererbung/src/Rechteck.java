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
	
	public static void main(String[] args) {
		Rechteck r1 = new Rechteck();
		Rechteck r2 = new Rechteck(3,5);
		
		Quader q1 = new Quader(2.0, 3.0, 4.0);
		// toString() wird hier automatisch aufgerufen
		System.out.println(r1.flaeche());
		System.out.println(q1.flaeche());
		// String-Repräsentation
//		System.out.println(r2.toString());
//		String r1String = r1.toString();

		// Polymorphie
		ausgabe(r1);
		ausgabe(q1); 	
		
		Kreis kreis1 = new Kreis(7.0);
		Kugel kugel2 = new Kugel(4.3);
		
		ArrayList<Figur> liste = new ArrayList<>();
		liste.add(kreis1);
		liste.add(q1);
		liste.add(kugel2);
		liste.add(r1);
		
		for(Figur f : liste) {
			// Zur Laufzeit wird bestimmt, welche Methode
			// flaeche aufgerufen wird. Dies ist abhängig
			// von dem Typen des Objektes. 
			System.out.println(f.flaeche());
		}
		
	}
	
	// als Eingabe wird alles akzeptiert, was ein Rechteck und davon abgeleitet ist.
	public static void ausgabe(Rechteck form) {
		form.status(); // Hier sucht sich das System die korrekte Methode aus
		// kein Zugriff auf hoehe, da diese nicht zum Rechteck gehört
		// System.out.println(form.hoehe);
		// form.volumen();
	}
	
}
