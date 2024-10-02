
public class Main {
	
	
	public static void main(String[] args) {
		int wert = -2_000_000;
		long einLong = wert; // implizites Casting, unkritisch
		
		
		long einLong2 = -5_000_000_000L;
		int einInt = (int) einLong2 + 5;
		System.out.println(einInt);
		
		// Overflow
		int grossesInt = -2_147_483_648;
		int erg = grossesInt -3;
		System.out.println(erg);
		
		int a = 65, b = 4;
		erg = a / b;
		System.out.println(erg); // 16, da Ganzzahldivision, Nachkommastellen werden
		// abgeschnitten
		
		erg = a / b;

		double erg2 = a / b;
		System.out.println(erg2); 
		
		float einFloat = 3.3f;
		erg2 = (double) a / b;
		System.out.println(erg2);
		
		String wort = "Hallo";
		String buchstabe = "b";
		String leer = "";
		String nullString = null;
		
		// wenn wir die Strings verarbeiten wollen, nehmen wir den Variablennamen
		// und verknüpfen ihn mit . zu einer Operation.
		// "Hallo"
		char zeichen = wort.charAt(2);
		wort = "Döner";
		// wort.replace('ö', 'ü'); // kein Effekt auf Wort
		wort = wort.replace('ö', 'ü'); 
		String wort2 = wort;
		String wort3 = "Düner";
		System.out.println(wort);
		
		// Stringvergleich in Java
		// wort == "Düner"
		// Inhallicher Vergleich
		// wort.equals("Döner")
		if(wort.equals("Düner")) {
			System.out.println("Sind inhaltlich gleich");
		}
		if(wort == "Düner") {
			System.out.println("Speicher ist gleich");
		}
		if(wort == wort2) {
			System.out.println("Variablen: Speicher ist gleich");
		}
		if(wort == wort3) {
			System.out.println("Variablen Variante 2: Speicher ist gleich");
		}
		
		System.out.println(wort.compareTo("Düner"));
		int copepoint = (int) 'S';
		System.out.println(copepoint);
		
		int test = 19;
		if (test > 20) {
			System.out.println("> 20");
		} 
		if (test > 10 && test <= 20) {
			System.out.println("> 10 && <= 20");
		}
		if (test <= 10) {
			System.out.println("< 10");
		}
		
		int test2 = 0;
		// Für disjunkte (sich ausschließende) Fälle 
		// nimmt man if .. else if
		if (test > 20) {
			System.out.println("> 20");
			test2 = 1;
		} 
		else if (test > 10 && test <= 20) {
			System.out.println("> 10 && <= 20");
			// Variable anlegen
			// int test2 = 7;
			test2 = 2;
		}
		else if (test <= 10) {
			System.out.println("< 10");
			test2 = 3;
		} else {
			System.out.println("Alle anderen");
			test2 = 4;
		}
		// Hier ausgeben
		System.out.println(test2);
		
		
		
	}

}
