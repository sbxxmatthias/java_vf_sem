import java.awt.Color;

public class Auto {

	// Fahrzeugtyp
	private Fahrzeugtyp fz;
	// Hersteller
	private String hersteller;
	// Modell
	private String modell;
	// Baujahr
	private int baujahr;
	// Leistung (PS)
	private int leistung;
	// Kilometerstand
	private double kilometer;
	// Farbe
	private Color farbe;
	
	// Wie erzeuge ich Objekte?
	// Default-Konstruktor, wenn keine eigene Implementierung 
	// eines Konstruktors vorliegt.
	
	
	// eigene Konstruktoren:
	public Auto() {
		this.hersteller = "BMW";
		this.modell = "M8";
		this.fz = Fahrzeugtyp.Sportwagen;
		this.baujahr = 2023;
		this.leistung = 610;
		this.kilometer = 0;
		this.farbe = Color.white;
	}
	
	// überladene Konstruktoren
	public Auto(String hersteller, String modell, Fahrzeugtyp fz, 
			int baujahr, int leistung, double kilometer, Color farbe) {
		// this bezieht sich immer auf das Objekt, mit dem eine Methode
		// aufgerufen wurde, damit Änderungen nur für dieses (this) Objekt
		// übernommen werden. 
		this.hersteller = hersteller;
		this.modell = modell;
		this.fz = fz;
		this.baujahr = baujahr;
		this.leistung = leistung;
		this.kilometer = kilometer;
		this.farbe = farbe;
	}
	
	// mit dem Auto fahren
	public void fahre(double strecke) {
		this.kilometer += strecke;
	}
	
	public void tuning(double faktor) {
		this.leistung *= faktor;
	}
	
	public void status() {
		System.out.println("Hersteller: " + this.hersteller);
		System.out.println("Modell: " + this.modell);
		System.out.println("Fahrzeugtyp: " + this.fz);
		System.out.println("Baujahr: " + this.baujahr);
		System.out.println("PS: " + this.leistung);
		System.out.println("Kilometer: " + this.kilometer);
		System.out.println("Farbe: " + this.farbe);
	}
	
	public static void main(String[] args) {
		// Konstruktor-Aufruf
		Auto bmw = new Auto();
		Auto dacia = new Auto("Dacia", "Duster", Fahrzeugtyp.Kompaktwagen, 
				2015, 65, 56890.6, Color.white) ;
		Auto id3 = new Auto("VW", "ID3", Fahrzeugtyp.Kompaktwagen, 
				2024, 300, 0.0, Color.black);
		
		// drei unterschiedliche ids
		Auto bmw2 = bmw;
		System.out.println(bmw + " " + bmw2 + " " + dacia + " " + id3);
		
		bmw.status();
		bmw.fahre(20);
		bmw.status();
		bmw2.fahre(30);
		bmw.status();
		
		
		dacia.status();// nur den BMW fahren (und ändern)
		dacia.tuning(1.2);
		dacia.status();
//		bmw.fz = Fahrzeugtyp.Sportwagen;

	}

}
