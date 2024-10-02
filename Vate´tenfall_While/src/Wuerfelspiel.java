import java.util.Random;

public class Wuerfelspiel {

	
	public static void showDice(int wurf) {
		System.out.println(wurf);
	}
	
	public static void main(String[] args) {
		// lass uns solange würfeln, bis wir die 6 getroffen haben
		// UND die Anzahl der Versuche zählen
		System.out.println(args[0]);
		
		Random gen = new Random();
		int wurf = gen.nextInt(1,Integer.parseInt(args[0])+1);
		
		showDice(wurf);
		
		
		// Caesar Chiffre
		// Um n Stellen verschieben
		// A => D bei n = 3
		// Z => C man fängt vorne wieder an. 
		// Schleifen
		// Kontrollstrukturen
		// Modulo
		// Ein- und Ausgabe
		// Codepoints
	}

}
