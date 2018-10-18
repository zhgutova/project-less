package less1;

public class Task5 {

	public static void main(String[] args) {
// ¬ывести значение переплаты overPaym по кредиту loanAmount с процентной ставкой percRate за период loanPeriod лет
		int loanAmount = 1200000;
		int loanPeriod = 5;
		double percRate = 11.5;
		double overPaym = loanPeriod*loanAmount*percRate/100;
		System.out.println("ѕереплата по кредиту " + loanAmount + " со ставкой " + percRate + "% за " + loanPeriod +
				" лет составит " + overPaym);

		

	}

}
