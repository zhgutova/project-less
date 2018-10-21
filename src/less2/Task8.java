package less2;

public class Task8 {

	public static void main(String[] args) {
		/*
		 Есть три вершины X, Y, Z. 
Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа. 
Нужно определить - является ли треугольник с заданными координатами прямоугольным
		 */
		int x1=-1, y1=-1, x2=1, y2=-1, x3=-1, y3=2, ab, ac, bc, max;
		ab = (int)Math.pow((x2-x1), 2) + (int)Math.pow((y2-y1), 2);
		ac = (int) Math.pow((x3-x1), 2) + (int) Math.pow((y3-y1), 2);
		bc = (int) Math.pow((x3-x2), 2) + (int) Math.pow((y3-y2), 2);
		//System.out.println(ac + " " + ab + " " + bc);
		max = Math.max(Math.max(ab, ac), bc);
		if (max == Math.abs(max - ab - ac - bc)) {System.out.println("Треугольник прямоугольный");}
		else {System.out.println("Треугольник не прямоугольный");}
		
	}

}
