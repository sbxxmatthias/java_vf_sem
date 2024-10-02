// Wir leiten nun die Klasse Quader von Rehcteck ab, da
// Quader eine Erweiterung von Rechteck ist.
// Ide: wir implementieren hier NUR das, was zusätzlich vorhanden oder anders 
// als in Rechteck ist.

public class Quader extends Rechteck {

	// Zusätzlich
	private double hoehe;
	private double volumen;
	// private double breite; // 0.0
	
	public Quader(double breite, double laenge, double hoehe) {
		// Konstruktor von Rechteck wiederverwenden
		super(breite, laenge); // Konstruktor aus Rechteck wird aufgerufen
		this.hoehe = hoehe;
	}

	// Was ist anders / was hat eine andere semantik?
	// anders: Flächenberechnung
	// Diese Methode wird überschrieben aus der Elternklasse
	public double flaeche() {
		System.out.println(this.breite);
		return 2 * this.breite * this.laenge + 
				2 * this.breite * this.hoehe +
				2 * this.laenge * this.hoehe;
	}	
	
	
	public void status() {
		System.out.println("Ich bin ein Quader");
	}
	
	// neu: Volumen
	public double volumen() {
		return this.volumen = this.hoehe * super.laenge * super.breite;
	}
	
}
