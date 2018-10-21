package less2;

public class Task9 {

	public static void main(String[] args) {
		/* «адать количество тарелок и количество моющего средства. 
ћоющее средство расходуетс€ из расчета 0,5 на одну тарелку. 
¬ цикле выводить сколько моющего средства осталось после мыть€ каждой тарелки 
¬ конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот. */
		int countDish = 6, i=0;
		double countFairy = 2;
		while (countDish>0 & countFairy> 0.4)
		{
			countFairy = countFairy - 0.5;
			countDish--;
			i++;
			System.out.println("ќсталось моющего средства " + countFairy + " после мыть€ тарелки " + i);
		}
		System.out.println("ќсталось тарелок " + countDish + " ќсталось моющего средства " + countFairy);
	}

}
