package less1;

public class Task1 {

	public static void main(String[] args) {
		// ������� ������� ��������������� � ������ length, ������� width, ������� height
		// ������� ���������� � ���, ��� ������ - ������ height ��� ������ width

			int length = 20;
			int width = 15;
			int height = 10;
			int area = 2*(length*width + length*height + width*height);
			System.out.println("������� ��������������� � ������ " + length + " ������� " 
			+ width +" ������� " + height + " = " + area);
			String str = (height > width) ? "������ ������ ������" : "������ ������ ������";
			System.out.println(str);
	}

}
