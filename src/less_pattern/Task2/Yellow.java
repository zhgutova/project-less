package less_pattern.Task2;

public class Yellow implements Alarm{
	private int tempAlarm = 300;
	boolean isActive;
	
	@Override
	public void tempChanged(int temp) {
		// TODO Auto-generated method stub
		if (temp >= this.tempAlarm && this.isActive != true) {
			System.out.println("Температура " + temp + ". Сработала сигнализация " + this.getClass().getSimpleName());	
			this.isActive = true;
		}
		else if (temp < this.tempAlarm && this.isActive == true) {
			this.isActive = false;
			System.out.println("Температура " + temp + ". Сигнализация " + this.getClass().getSimpleName() + " отключена");
		}
	}

}
