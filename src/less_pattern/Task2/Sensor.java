package less_pattern.Task2;

import java.util.ArrayList;

public class Sensor {

	private ArrayList<Alarm> listAlarm = new ArrayList<>();
	
	public void add(Alarm alarm) {
		this.listAlarm.add(alarm);
	}
	

	
	public void notify(int temp) {
		for (Alarm alarm : listAlarm)
			alarm.tempChanged(temp);
	}

}
