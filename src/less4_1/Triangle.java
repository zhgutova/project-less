package less4_1;

public class Triangle {
	
	private Coord coordA, coordB, coordC;
	
	public Coord getCoordA() {
		return coordA;
	}

	public Coord getCoordB() {
		return coordB;
	}

	public Coord getCoordC() {
		return coordC;
	}

	public Triangle(Coord coordA, Coord coordB, Coord coordC) {
		this.coordA = coordA;
		this.coordB = coordB;
		this.coordC = coordC;
	}

	public double Perim () {
		return (Coord.Dist(this.coordA,this.coordB)+Coord.Dist(this.coordA,this.coordC)+Coord.Dist(this.coordB,this.coordC));
	}
	
	public double Square () {
		double pp = Perim()/2;
		return Math.sqrt(pp*(pp-Coord.Dist(this.coordA,this.coordB))*(pp-Coord.Dist(this.coordA,this.coordC))*(pp-Coord.Dist(this.coordB,this.coordC)));
	}

}


