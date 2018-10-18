package less1;

public class Task2 {

	public static void main(String[] args) {
		// —адовый участок garden 10 соток разбит на гр€дки gardenBed 15 на 25 метров. ¬ывести кол-во freeGardenBed незан€тых м2
		
		int garden = 10 * 100; // 1 сотка = 100 м^2
		int countGardenBed = garden / (15*25); //кол-во гр€док
		int freeGardenBed = garden - (countGardenBed*(15*25));
		System.out.println("Ќа участке 10 соток, разбитом на гр€дки 15*25 м, не зан€то " + freeGardenBed + "м^2");
		

	}

}
