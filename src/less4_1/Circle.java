package less4_1;

public class Circle {
	
	private Coord coordA, coordB;
	
	public Circle(Coord coordA, Coord coordB) {
		super();
		this.coordA = coordA;
		this.coordB = coordB;
	}

	public Coord getCoordA() {
		return coordA;
	}

	public Coord getCoordB() {
		return coordB;
	}
	
	public double Radius () {
		return (Coord.Dist(this.coordA, this.coordB));
	}
	public double Perim () {
		return (2*Math.PI*Radius());
	}
	
	public double Square () {
		return (Math.PI*Math.pow(Radius(), 2));
	}

}
