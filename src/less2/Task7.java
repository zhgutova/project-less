package less2;

public class Task7 {

	public static void main(String[] args) {
		/*
		 Электронные часы показывают время в формате от 00:00 до 23:59. 
		 Подсчитать сколько раз за сутки случается так, 
		 что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
		 */
		int hour, minut, count=0;
		for (hour = 0; hour < 24; hour++)
		{
			for (minut = 0; minut < 60; minut++)
			{
				if ((hour/10 % 10 == minut % 10) & (hour % 10 == minut/10 % 10)) {
					count++;
					//System.out.println(hour + ":" + minut);
				}
			}
		}
		System.out.println("Кол-во симметричных комбинаций " + count);
	}

}
