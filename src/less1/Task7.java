package less1;

public class Task7 {

	public static void main(String[] args) {		
//		Вывести наибольшую цифру maxNum любого трехзначного числа num
		int num = 750;
		int maxNum = num%10;
		System.out.print("В числе " + num + " наибольшая цифра ");
		num/=10;
		maxNum = (maxNum<num%10)? num%10 : maxNum;
		num/=10;
		maxNum = (maxNum<num%10)? num%10 : maxNum;
		System.out.println(maxNum);		
	}

}
