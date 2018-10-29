package less4_1;

public class Rectangle {
	
private Coord coordA, coordB, coordC, coordD;
	
	public Coord getCoordA() {
		return coordA;
	}

	public Coord getCoordB() {
		return coordB;
	}

	public Coord getCoordC() {
		return coordC;
	}
	
	public Coord getCoordD() {
		return coordD;
	}

	public Rectangle (Coord coordA, Coord coordB, Coord coordC, Coord coordD) {
		this.coordA = coordA;
		this.coordB = coordB;
		this.coordC = coordC;
		this.coordD = coordD;
	}

	public double Perim () {
		return (2*(Coord.Dist(this.coordA, this.coordB)+Coord.Dist(this.coordA, this.coordC)));
	}
	
	public double Square () {
		return (Coord.Dist(this.coordA, this.coordB)*Coord.Dist(this.coordA, this.coordC));
	}
	
}
