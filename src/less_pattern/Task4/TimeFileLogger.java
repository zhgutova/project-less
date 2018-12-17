package less_pattern.Task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class TimeFileLogger implements ILogger {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		try (
			FileOutputStream fos = new FileOutputStream (new File ("C:/test/TimeFileLogger.txt")))
		{
			String log = (new Date()).toString() ;
			fos.write((log + " !!TimeFileLogger!!").getBytes());
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}