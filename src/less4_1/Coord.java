package less4_1;

public class Coord {
	
	int x, y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static double Dist (Coord a, Coord b) {
		return Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
	}
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	

}
