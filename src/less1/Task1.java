package less1;

public class Task1 {

	public static void main(String[] args) {
		// Вывести площадь параллелепипеда с длиной length, шириной width, высотой height
		// Вывести информацию о том, что больше - высота height или ширина width

			int length = 20;
			int width = 15;
			int height = 10;
			int area = 2*(length*width + length*height + width*height);
			System.out.println("Площадь параллелепипеда с длиной " + length + " шириной " 
			+ width +" высотой " + height + " = " + area);
			String str = (height > width) ? "Высота больше Ширины" : "Ширина больше Высоты";
			System.out.println(str);
	}

}
