import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double faktor;
		int gehalt = 4200;
		// Python: <!-- -->
		// gehalt_einsteiger
		// lowerCamerCase
		// Zuweisung
		int gehaltEinsteiger = 2000;
		boolean sonne = false;
		char zeichen = ' ';
		
		final int GEHALT_BOSS = 10000;
		// gehaltBoss = 9000; // nicht möglich, da final
		
		System.out.println(4 < 5);

		// System.out.println(faktor);
		System.out.println(gehalt);
		
		String wort = "Hallo";
		String klasse = "Klasse";
		
		System.out.println(wort + klasse);
		
		
		boolean isSunny = true;
		boolean isWarm = false;
		boolean isWindy = false;
		
		// Verknüpfung mit logischen Operatoren
		System.out.println(isSunny && isWarm);
		
		System.out.println((isSunny || isWarm) && isWindy);
		
		// Auf Gleichheit prüfen !
		// = Zuweisung
		// == Vergleich
		System.out.println(gehaltEinsteiger == GEHALT_BOSS); // false
		System.out.println(gehaltEinsteiger != GEHALT_BOSS); // true
		
		
		int a = 0;
		a = a + 1;
		a += 1; // kombinierte Zuweisungsopoerator: -=, *=, %= /=
		a++; // a = a + 1
		
		a = 10;
		// Hier wird a erst erhöht und dann wird addiert.
		int erg = ++a + a++;
		System.out.println(erg);
		System.out.println(a);
		
		a = 10;
		erg = a++ + a++;
		// Hier wird das erste a nach der Addition erhöht.
		System.out.println(erg);
		System.out.println(a);
		
		// Bitoperatoren
		int shift = 4 << 2;
		//   100
		// 10000
		System.out.println(shift);
		// >> 
		int shift2 = 5 >> 2;
		// 101
		// 001
		System.out.println(shift2);
		
		//   101
		// & 001
		//   001
		
		// ^ XOR

		System.out.println(isSunny ^ isWarm); // true
		// true true false
		// true false true
		// false true true
		// false false false
		// Hands-On: Es gibt 3 boolsche Variablen.
		// wenn genau EINE der Variablen true ist, wird der gesamte Ausdruck true
		
		isSunny = true;
		isWarm = true;
		isWindy = true;
		System.out.println("Genau eines muss wahr sein");
		System.out.println((isSunny && !isWarm && !isWindy) 
				|| (!isSunny && isWarm && !isWindy) 
				|| (!isSunny && !isWarm && isWindy));
	
	
		String zahlAlsString = "123";
		String zahlAlsString2 = "654";
		System.out.println(zahlAlsString + zahlAlsString2);
		
		// Typumwandlung erforderlich
		int x = Integer.parseInt(zahlAlsString); // "123" => 123
		int y = Integer.parseInt(zahlAlsString2); // "123" => 123
		// in x steht jetzt 123 drin
		System.out.println(x + y);
		
		// Konsole:
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		String eingabe = scan.next();
		// scan.nextInt();
		int input = Integer.parseInt(eingabe); // "15" => 15
		System.out.println(input + 3);
		
		// UI-Eingabefenster
		eingabe = JOptionPane.showInputDialog(null, "Bitte Zahl eingeben: ");
		System.out.println(eingabe);
		// Double.parseDouble(zahlAlsString2);
		
		int gehaltProfi = 7000;
		
		if(gehaltProfi > 6500) {
			System.out.println("Spitzenverdiener");
		}
		// if(4000 < gehaltProfi < 5000) {
		if(4000 < gehaltProfi && gehaltProfi < 5000) {
			System.out.println("Mittelverdiener");
		}
		
		
		// implizites Typecasting von int zu String
		System.out.println("Ergebnis: " + gehaltProfi);
		
		int wert = -2_000_000;
		long einLong = wert; // implizites Casting, unkritisch
		
		
		long einLong2 = -5_000_000_000L;
		int einInt = (int) einLong2;
		System.out.println(einInt);
		
		
	}
	
	
	
	

}
