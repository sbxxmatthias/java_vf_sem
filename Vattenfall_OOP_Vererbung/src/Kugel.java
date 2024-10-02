
public class Kugel extends Kreis{

	
	public Kugel(double radius) {
		super(radius);
	}
	
	public double flaeche() {
		return 4 * Math.PI * (this.radius * this.radius);
	}

}
