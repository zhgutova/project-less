package less1;

public class Task5 {

	public static void main(String[] args) {
// ������� �������� ��������� overPaym �� ������� loanAmount � ���������� ������� percRate �� ������ loanPeriod ���
		int loanAmount = 1200000;
		int loanPeriod = 5;
		double percRate = 11.5;
		double overPaym = loanPeriod*loanAmount*percRate/100;
		System.out.println("��������� �� ������� " + loanAmount + " �� ������� " + percRate + "% �� " + loanPeriod +
				" ��� �������� " + overPaym);

		

	}

}
