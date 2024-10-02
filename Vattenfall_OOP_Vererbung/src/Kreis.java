import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Kreis extends Figur {
	
	protected double radius;
	private static double eingabe;
	
	
	public Kreis(double r) {
		this.radius = r;
	}
	
	public double flaeche() {
		return Math.PI * (this.radius * this.radius);
	}
	
	public static void eingabe() {
		try {
	        String entry = JOptionPane.showInputDialog("Bitte trage den gewünschten Radius ein:"); 
	          eingabe = Double.parseDouble(entry);
	        // Create a JOptionPane to display a message with a personalized greeting 
	        
		}
		catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		catch(Exception e){
			System.out.println("Fehler! Geben sie NUR einen double Wert ein.");
			JOptionPane.showMessageDialog(null, "Nur Double Werte eintragen!", "Fehler", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		
	}
	public static void main(String[] args) {
		while(true) {

			eingabe();

			Kreis k1 = new Kreis(eingabe);
			Kugel k2 = new Kugel(eingabe);
			JOptionPane.showMessageDialog(null, "Die Fläche des Kreises beträgt: " + k1.flaeche() + "!");
			JOptionPane.showMessageDialog(null, "Die Oberfläche der klugel beträgt: " + k2.flaeche() + "!");
			
			//Fenster zum verlassen des Programms
			int result = JOptionPane.showConfirmDialog(null,
			        "Möchten Sie das Programm beenden?",
			        "Bestätigen", JOptionPane.YES_NO_CANCEL_OPTION);
			if (result == JOptionPane.YES_OPTION) System.exit(0);
			
			System.out.println("Die Fläche des Kreises beträgt: " + k1.flaeche() + " m^2");
			System.out.println("Die Oberfläche der klugel beträgt: " + k2.flaeche() + " m^2");
			System.out.println("------------------------------------------------------------------");
		}

	}

}
