package less1;

public class Task6 {

	public static void main(String[] args) {
		// НАйти корни квадратного уровнения a*x^2+b*x+c=0, либо сообщить, что их нет
		double a, b, c, x1, x2, discr;
		a=2;
		b=4.5;
		c=1;
		discr = b*b - 4*a*c;
		System.out.println("Дискриминант " + discr);
		if (discr < 0.0) {System.out.println("Вещественных корней нет");}
		else 
			{
			if (discr == 0) 
				{
				x1 = x2 = -b/(2*a);
				System.out.println("x1 = " + x1 + "; x2 = " + x2);
				}
			else 
				{
				x1 = (-b+Math.sqrt(discr))/(2*a);
				x2 = (-b-Math.sqrt(discr))/(2*a);
				System.out.println("x1 = " + x1 + "; x2 = " + x2);
				}
			};
		
		
		
		
		
	}

}
