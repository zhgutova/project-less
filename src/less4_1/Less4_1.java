package less4_1;

public class Less4_1 {

	public static void main(String[] args) {
		// 
		double distAB, distAC, distBC;

		
		Coord coordA = new Coord (1, 7);
		System.out.println("Координата А: " + coordA.toString());
		
		Coord coordB = new Coord (1, 1);
		System.out.println("Координата B: " + coordB.toString());
		
		Coord coordC = new Coord (7, 7);
		System.out.println("Координата C: " + coordC.toString());
		
		Coord coordD = new Coord (7, 1);
		System.out.println("Координата D: " + coordD.toString());

		Triangle tr1 = new Triangle (coordA, coordB, coordC); 
		Rectangle rec1 = new Rectangle (coordA, coordB, coordC, coordD);
		Circle cer1 = new Circle (coordA, coordB);
		
		distAB = Coord.Dist(coordA, coordB);
		distAC = Coord.Dist(coordA, coordC);
		distBC = Coord.Dist(coordB, coordC);
		
		System.out.println("Расстояние между А и В: " + distAB);
		System.out.println("Расстояние между А и С: " + distAC);
		System.out.println("Расстояние между B и C: " + distBC);
		System.out.println();
		System.out.println("Периметр треугольника ABC: " + tr1.Perim());	
		System.out.println("Площадь треугольника ABC: " + tr1.Square());
		System.out.println("Периметр прямоугольника ABCD: " + rec1.Perim());	
		System.out.println("Площадь прямоугольника ABCD: " + rec1.Square());	
		System.out.println("Радиус окружности с центром в A и точкой B: " + cer1.Radius());
		System.out.println("Периметр окружности с центром в A и точкой B: " + cer1.Perim());	
		System.out.println("Площадь окружности с центром в A и точкой B: " + cer1.Square());
		
	}

}
